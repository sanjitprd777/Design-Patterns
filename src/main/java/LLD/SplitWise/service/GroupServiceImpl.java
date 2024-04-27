package LLD.SplitWise.service;

import LLD.SplitWise.entities.BalanceMap;
import LLD.SplitWise.entities.Expense;
import LLD.SplitWise.entities.Group;
import LLD.SplitWise.entities.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupServiceImpl implements GroupService {

    HashMap<String, User> users;
    HashMap<String, Group> groups;
    HashMap<Group, List<User>> groupUserMap;
    HashMap<String, List<Expense>> groupExpense;
    HashMap<String, BalanceMap> groupBalance;

    public GroupServiceImpl() {
        this.users = new HashMap<>();
        this.groups = new HashMap<>();
        this.groupUserMap = new HashMap<>();
        this.groupExpense = new HashMap<>();
        this.groupBalance = new HashMap<>();
    }

    @Override
    public void showBalanceOfUser(String groupId, String userId) {
        List<Expense> expenses = groupExpense.get(groupId).stream().filter(e -> users.get(e.getUserId()).getId().equals(userId)).toList();
        if (!expenses.isEmpty()) {
            for (Expense e : expenses) {
                System.out.println(users.get(e.getUserId()).getName() + " : " + e.getAmount());
            }
            return;
        }
        System.out.println("No Balance");
    }

    @Override
    public void showBalanceOfGroup(String groupId) {
        List<Expense> expenses = groupExpense.get(groupId);
        if (!expenses.isEmpty()) {
            for (Expense e : expenses) {
                System.out.println(users.get(e.getUserId()).getName() + " : " + e.getAmount().getAmount());
            }
            return;
        }
        System.out.println("No Balance");

    }

    @Override
    public void addExpenseToGroup(String groupId, Expense expense) {
        groupExpense.get(groupId).add(expense);
    }

    @Override
    public void removeExpenseFromGroup(String groupId, Expense expense) {

    }

    @Override
    public void createOrAddUserToGroup(Group group, User user) {
        if (!groups.containsKey(group.getId())) {
            groups.put(group.getId(), group);
            groupUserMap.put(group, new ArrayList<>());
            groupExpense.put(group.getId(), new ArrayList<>());
            groupBalance.put(group.getId(), new BalanceMap());
        }
        if (!users.containsKey(user.getId())) {
            users.put(user.getId(), user);
        }
        groupUserMap.get(group).add(user);
    }

    @Override
    public void simplifyExpenseOfGroup(String groupId) {

    }

    @Override
    public void updateBalanceMapOfGroup(String groupId, String userId1, String userId2, Double amt) {
        HashMap<String, Double> user1AmountMap = groupBalance.get(groupId).getBalanceMap().get(userId1);
        HashMap<String, Double> user2AmountMap = groupBalance.get(groupId).getBalanceMap().get(userId2);
        if (user1AmountMap==null)   user1AmountMap = new HashMap<>();
        if (user2AmountMap==null)   user2AmountMap = new HashMap<>();

        // Check if user2 getting money from user1
        amt += user2AmountMap.getOrDefault(userId1, 0.0);

        user1AmountMap.put(userId2, user1AmountMap.getOrDefault(userId2, 0.0) + amt);
    }
}
