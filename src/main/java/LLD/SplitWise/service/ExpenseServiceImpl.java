package LLD.SplitWise.service;

import LLD.SplitWise.entities.Amount;
import LLD.SplitWise.entities.Expense;
import LLD.SplitWise.entities.SplitType;

import java.util.ArrayList;
import java.util.List;

public class ExpenseServiceImpl implements ExpenseService {

    GroupService groupService;

    public ExpenseServiceImpl(GroupService groupService) {
        this.groupService = groupService;
    }

    @Override
    public void addExpense(String expense) {
        /*
        EXPENSE g1 u1 1000 4 u1 u2 u3 u4 EQUAL
        EXPENSE g1 u1 1250 2 u2 u3 EXACT 370 880
        EXPENSE g1 u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20
         */
        String[] input = expense.split(" ");
        String groupId = input[1];
        String userId = input[2];
        Double amount = Double.parseDouble(input[3]);
        int userCount = Integer.parseInt(input[4]);
        List<String> userList = new ArrayList<>();
        int i=5;
        for (i=5; i<5+userCount;++i)
            userList.add(input[i]);

        SplitType splitType = getSplitType(input[i++]);

        List<Double> amounts = new ArrayList<>();
        while (i < input.length)
            amounts.add(Double.parseDouble(input[i++]));

        System.out.printf("Group id: %s\n", groupId);
        System.out.printf("User id: %s\n", userId);
        System.out.printf("Amount: %f\n", amount);
        System.out.printf("User count: %d\n", userCount);
        System.out.printf("User id list: %s\n", userList);
        System.out.printf("SplitType: %s\n", splitType);
        System.out.printf("Amounts: %s\n", amounts);

        switch (splitType) {
            case EXACT -> {
                break;
            }
            case SHARE -> {
                break;
            }
            case PERCENTAGE -> {
                break;
            }
            default -> {
                double amt = amount/userCount;
                groupService.addExpenseToGroup(groupId, new Expense("e1", "expense", new Amount(amount-amt), userId));

                for (i=1;i<userList.size();++i) {
                    Expense exp = new Expense("e1", "expense", new Amount(-amt), userList.get(i));
                    groupService.addExpenseToGroup(groupId, exp);
                    groupService.updateBalanceMapOfGroup(groupId, userId, userList.get(i), amt);
                }
            }
        }
    }

    @Override
    public void removeExpense(String expense) {

    }

    private SplitType getSplitType(String splitType) {
        switch (splitType) {
            case "EXACT" -> {
                return SplitType.EXACT;
            }
            case "PERCENTAGE" -> {
                return SplitType.PERCENTAGE;
            }
            case "SHARE" -> {
                return SplitType.SHARE;
            }
            default -> {
                return SplitType.EQUAL;
            }
        }
    }
}
