package ParaBank;

public interface Selectors {
    public String siteUrl = "https://parabank.parasoft.com/parabank/index.htm";
    public String register = "[href='register.htm;jsessionid=DFCB49753B442331BFE85790700C7FA8']";
    public String userNameInput = "[type='text']";

    public String passwordInput = "[type='password']";

    public String userName = "ike12";
    public String password = "judas22";

    public String login = "[type='submit']";

    //registration credentials

    public String firstName = "customer.firstName";
    public String lastName = "customer.lastName";
    public String street = "customer.address.street";
    public String city = "customer.address.city";
    public String state = "customer.address.state";
    public String zipCode = "customer.address.zipCode";
    public String phoneNumber = "customer.phoneNumber";
    public String ssn = "customer.ssn";
    public String UserNameReg =  "customer.username";
    public String passwordReg = "customer.password";

    public String confirmPasswordReg = "repeatedPassword";
    public String submitButton = "[value='Register']";

    public String confirmMessageTitle = "h1";

    public String ConfirmMessageTxt = "Welcome "+ userName;






}
