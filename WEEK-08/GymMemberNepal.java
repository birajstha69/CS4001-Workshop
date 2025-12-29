import java.time.LocalDate;
import java.time.Period;
public class GymMemberNepal{                // Attributes
    private String memberName;
    private String membershipType; // Monthly, Quarterly, Yearly
    private double monthlyFee;
    private LocalDate joinDate;
    public GymMemberNepal(String memberName, String membershipType,double monthlyFee, LocalDate joinDate){      // Constructor
        this.memberName= memberName;
        this.membershipType= membershipType;
        this.monthlyFee= monthlyFee;
        this.joinDate= joinDate;
    }
    public double calculateAnnualFee(){               // Calculate annual fee including 13% VAT (Nepali tax)
        double yearlyFee= monthlyFee * 12;
        double vat= yearlyFee * 0.13;
        return yearlyFee + vat;
    }
    public double getDiscountedFee(double discountPercent){           // Calculate discounted monthly fee
        return monthlyFee - (monthlyFee * discountPercent / 100);
    }
    // Check loyalty discount eligibility (> 6 months)
    public boolean isEligibleForDiscount(){
        Period period = Period.between(joinDate, LocalDate.now());
        return period.getMonths() + (period.getYears() * 12) > 6;
    }
    // Display member details in Nepali style
    public void displayMemberInfo(){
        System.out.println("--------- Fitness Nepal Gym ---------");
        System.out.println("नाम (Name): " + memberName);
        System.out.println("सदस्यता प्रकार (Membership): " + membershipType);
        System.out.println("मासिक शुल्क (Monthly Fee): Rs. " + monthlyFee);
        System.out.println("भर्ना मिति (Join Date): " + joinDate);
        System.out.println("वार्षिक शुल्क (Yearly Fee with 13% VAT ): Rs. " + calculateAnnualFee());
        System.out.println("loyalty Discount Eligible: " +(isEligibleForDiscount() ? "Yes" : "No"));
        System.out.println("------------------------------------\n");
    }
    // Main method for testing
    public static void main(String[] args){
        GymMemberNepal basic= new GymMemberNepal("Biraj Shrestha", "Basic (Monthly)",1500, LocalDate.of(2024, 1, 10));
        GymMemberNepal premium= new GymMemberNepal("Yodin Raya", "Premium (Quarterly)",2500, LocalDate.of(2023, 6, 5));
        GymMemberNepal vip= new GymMemberNepal("Divyamani Khawas", "VIP (Yearly)",4000, LocalDate.of(2022, 12, 1));
        basic.displayMemberInfo();
        premium.displayMemberInfo();
        vip.displayMemberInfo();
        // Discount example
        System.out.println("VIP Discounted Fee (10%): Rs. " + vip.getDiscountedFee(10));
    }
}