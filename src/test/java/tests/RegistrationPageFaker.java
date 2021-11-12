package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import page.RegistrationPage;


public class RegistrationPageFaker extends TestBase {

    Faker faker = new Faker();
    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userSex = "Male",
            userNumber = faker.number().digits(10),
            month = "March",
            year = "1990",
            day = "13",
            subject = "Biology",
            hobbie = "Sports",
            picture = "radio.jpeg",
            currentAddress = faker.address().streetAddress(),
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
