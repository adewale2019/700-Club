package industry;

public class Unionbank {

    private String date;
    private String userName;
    private AccountType accountType= AccountType.SAVING;

    public static String goodbyeMessage(String userName, String date, AccountType DOMICILIARY){
    return "bye," + userName +  "thanks for using union bank"  + "your account type is "+ "DOMICILIARY";

    }

    public static String accountinfo(String userName, float currentbal, float ammountwithdrawn){
        float remainingbal=  currentbal - ammountwithdrawn;
        return "Hello," + userName+ "your current account balance is: " + currentbal+ "you withdrew:" + ammountwithdrawn+ "your new balance will be:" + remainingbal;

    }

    public static void main(String[] args) {
        //System.out.println(goodbyeMessage("dave", "21/2014" ,AccountType.DOMICILIARY));
        System.out.println(accountinfo("Bible david", 7000, 3000));
    }}