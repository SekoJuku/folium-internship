package friday.behavioral.chainOfResponsibility;

public class EmailFilter extends Filter {

    public EmailFilter(Request request) {
        super(request);
    }

    @Override
    public void filter() throws Exception {
        request.getEmail().contains("@gmail.com");
        super.filter();
    }
}
