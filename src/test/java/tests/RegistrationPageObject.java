package tests;

import org.junit.jupiter.api.Test;
import page.RegistrationPage;

public class RegistrationPageObject extends TestBase {

    String firstName = "Bill",
            lastName = "Funny",
            userEmail = "horse@yahoo.com",
            userSex = "Male",
            userNumber = "1253643652",
            month = "March",
            year = "1990",
            day = "13",
            subject = "Biology",
            hobbie = "Sports",
            picture = "radio.jpeg",
            currentAddress = "Lenina street house",
            state = "NCR",
            city = "Delhi";

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void RegistrationPageWithPageObject() {
        openUrl();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputUserEmail(userEmail);
        registrationPage.inputSelectSex(userSex);
        registrationPage.inputUserNumber(userNumber);
        registrationPage.inputSelectDateOfBirth(month, year, day);
        registrationPage.inputSubject(subject);
        registrationPage.inputSport(hobbie);
        registrationPage.inputUploadPicture(picture);
        registrationPage.inputCurrentAddress(currentAddress);
        registrationPage.inputState(state);
        registrationPage.inputCity(city);
        registrationPage.inputSubmit();

        //Assert

        registrationPage.assertStudentName(firstName, lastName);
        registrationPage.assertStudentEmail(userEmail);
        registrationPage.assertGender(userSex);
        registrationPage.assertMobile(userNumber);
        registrationPage.assertDateOFBirth(day, month, year);
        registrationPage.assertSubject(subject);
        registrationPage.assertHobbies(hobbie);
        registrationPage.assertPicture(picture);
        registrationPage.inputCurrentAddress(currentAddress);
        registrationPage.assertStateAndCity(state, city);
    }
}
