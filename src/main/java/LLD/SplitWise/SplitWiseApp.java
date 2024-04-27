package LLD.SplitWise;

import LLD.SplitWise.service.ExpenseService;
import LLD.SplitWise.service.ExpenseServiceImpl;
import LLD.SplitWise.service.GroupService;
import LLD.SplitWise.service.GroupServiceImpl;

public class SplitWiseApp {

    ExpenseService expenseService;
    GroupService groupService;

    public SplitWiseApp() {
        this.groupService = new GroupServiceImpl();
        this.expenseService = new ExpenseServiceImpl(this.groupService);
    }
}
