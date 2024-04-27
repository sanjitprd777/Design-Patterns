package LLD.SplitWise.service;

import LLD.SplitWise.entities.Expense;
import LLD.SplitWise.entities.Group;
import LLD.SplitWise.entities.User;

public interface GroupService {

    void showBalanceOfUser(String groupId, String userId);
    void showBalanceOfGroup(String groupId);
    void addExpenseToGroup(String groupId, Expense expense);
    void removeExpenseFromGroup(String groupId, Expense expense);
    void createOrAddUserToGroup(Group group, User user);
    void simplifyExpenseOfGroup(String groupId);
    void updateBalanceMapOfGroup(String groupId, String userId1, String userId2, Double amt);
}
