public class Gift {
    private String giftName;
    private String gender;
    private String price;
    private String age;


    public Gift(String giftName, String gender,   String price, String age) {
        this.giftName = giftName;
        this.gender = gender;
        this.price = price;
        this.age = age;
    }

    public Gift() {
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
