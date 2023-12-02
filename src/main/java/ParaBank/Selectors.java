package ParaBank;


public interface Selectors {
    ParaBankObjects para = new ParaBankObjects();
    public String siteUrl = "https://parabank.parasoft.com/parabank/index.htm";
    public String userNameInput = "[type='text']";

    public String passwordInput = "[type='password']";
    //automatically generates a random user for multiple tests
    public String userName = "ikenna12"+ para.int_random;
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
    public String UserNameReg = "customer.username";
    public String passwordReg = "customer.password";

    public String confirmPasswordReg = "repeatedPassword";
    public String submitButton = "[value='Register']";

    public String confirmMessageTitle = "h1";

    public String ConfirmMessageTxt = "Welcome " + userName;

    //login credentials
    public String getFirstName = "uchenna";
    public String getLastName = "iwuchukwu";
    String getStreet = "25 ilupeju street";
    String getState = "Lagos";
    String getZipCode = "234564";
    String getCity = "Lagos";
    String getSsn = "3452662";
    String getPhoneNumber = "+23478976768879";
}
