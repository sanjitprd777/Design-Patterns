package LLD.SplitWise;

import LLD.SplitWise.entities.Group;
import LLD.SplitWise.entities.User;

public class Main {

    public static void main(String[] args) {
        SplitWiseApp splitWiseApp = new SplitWiseApp();

        /*
        EXPENSE g1 u1 1000 4 u1 u2 u3 u4 EQUAL
        EXPENSE g1 u1 1250 2 u2 u3 EXACT 370 880
        EXPENSE g1 u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20
         */

        Group group = new Group("g1", "Fantastic4");
        splitWiseApp.groupService.createOrAddUserToGroup(group, new User("u1", "Sanjit"));
        splitWiseApp.groupService.createOrAddUserToGroup(group, new User("u2", "Sahil"));
        splitWiseApp.groupService.createOrAddUserToGroup(group, new User("u3", "Surendra"));
        splitWiseApp.groupService.createOrAddUserToGroup(group, new User("u4", "Rahul"));

        splitWiseApp.groupService.showBalanceOfUser("g1", "u1");
        splitWiseApp.groupService.showBalanceOfGroup("g1");


        splitWiseApp.expenseService.addExpense("EXPENSE g1 u1 1000 4 u1 u2 u3 u4 EQUAL");
        splitWiseApp.expenseService.addExpense("EXPENSE g1 u1 2000 4 u1 u2 u3 u4 EQUAL");
//        splitWiseApp.expenseService.addExpense("EXPENSE g1 u1 1250 2 u2 u3 EXACT 370 880");
//        splitWiseApp.expenseService.addExpense("EXPENSE g1 u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20");

        splitWiseApp.groupService.showBalanceOfUser("g1", "u1");
        splitWiseApp.groupService.showBalanceOfGroup("g1");
    }
}
