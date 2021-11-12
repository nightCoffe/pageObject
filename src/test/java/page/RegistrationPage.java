package page;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public void inputFirstName(String firstName) {
        $("#firstName").setValue(firstName);
    }

    public void inputLastName(String lastName) {
        $("#lastName").setValue(lastName);
    }

    public void inputUserEmail(String userEmail) {
        $("#userEmail").setValue(userEmail);
    }

    public void inputSelectSex(String userSex) {
        $(byText(userSex)).click();
    }

    public void inputUserNumber(String userNumber) {
        $("#userNumber").setValue(userNumber);
    }

    public void inputSelectDateOfBirth(String month, String year, String day) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day).click();
    }

    public void inputSubject(String subject) {
        $("#subjectsInput").setValue(subject).pressEnter();
    }

    public void inputSport(String hobbie) {
        $(byText(hobbie)).scrollTo().click();
    }

    public void inputUploadPicture(String picture) {
        $("#uploadPicture").uploadFile(new File("src/test/resources/" + picture));
    }

    public void inputCurrentAddress(String currentAddress) {
        $("#currentAddress").setValue(currentAddress);
    }

    public void inputState(String state) {
        $("#react-select-3-input").setValue(state).pressEnter();
    }

    public void inputCity(String city) {
        $("#react-select-4-input").setValue(city).pressEnter();
    }

    public void inputSubmit() {
        $("#submit").click();
    }
    //Assert

    public void assertStudentName(String firstName, String lastName) {
        $(".modal-content").shouldHave(text("Student Name"), text(firstName + " " + lastName));
    }

    public void assertStudentEmail(String userEmail) {
        $(".modal-content").shouldHave(text("Student Email"), text(userEmail));
    }

    public void assertGender(String userSex) {
        $(".modal-content").shouldHave(text("Gender"), text(userSex));
    }

    public void assertMobile(String userNumber) {
        $(".modal-content").shouldHave(text("Mobile"), text(userNumber));
    }

    public void assertDateOFBirth(String day, String month, String year) {
        $(".modal-content").shouldHave(text("Date of Birth"), text(day + " " + month + "," + year));
    }

    public void assertSubject(String subject) {
        $(".modal-content").shouldHave(text("Subjects"), text(subject));
    }

    public void assertHobbies(String hobbie) {
        $(".modal-content").shouldHave(text("Hobbies"), text(hobbie));
    }

    public void assertPicture(String picture) {
        $(".modal-content").shouldHave(text("Picture"), text(picture));
    }

    public void assertAddress(String currentAddress) {
        $(".modal-content").shouldHave(text("Address"), text(currentAddress));
    }

    public void assertStateAndCity(String state, String city) {
        $(".modal-content").shouldHave(text("State and City"), text(state + " " + city));
    }
}
