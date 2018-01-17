package model;

public class AddressData {
  private final String firstName;
  private final String lastName;
  private final String address;
  private final String city;
  private final String postCode;
  private final String phoneMobile;
  private final String addressTitle;

  public AddressData(String firstName, String lastName, String address, String city, String postCode, String phoneMobile, String addressTitle) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.postCode = postCode;
    this.phoneMobile = phoneMobile;
    this.addressTitle = addressTitle;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getCity() {
    return city;
  }

  public String getPostCode() {
    return postCode;
  }

  public String getPhoneMobile() {
    return phoneMobile;
  }

  public String getAddressTitle() {
    return addressTitle;
  }
}
