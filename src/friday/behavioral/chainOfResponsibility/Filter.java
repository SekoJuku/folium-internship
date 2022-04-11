package friday.behavioral.chainOfResponsibility;

public abstract class Filter {
    protected Request request;
    protected Filter filter;

    public Filter() {

    }

    public Filter(Request request) {
        this.request = request;
    }


    public void filter() throws Exception {
        if(!(filter == null))
            filter.filter();
        else
            System.out.println("You've passed!");
    }
    public void setNext(Filter filter) {
        this.filter = filter;
    }
}
