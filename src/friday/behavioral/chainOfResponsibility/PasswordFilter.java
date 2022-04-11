package friday.behavioral.chainOfResponsibility;

public class PasswordFilter extends Filter{

    public PasswordFilter(Request request) {
        super(request);
    }

    @Override
    public void filter() throws Exception {
        String password = request.getPassword();
        if(password.length() < 8)
            throw new Exception("Password is too small");
        super.filter();
    }
}
