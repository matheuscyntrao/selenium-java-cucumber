package ProfissionaisDaSaude.Tasks.Identity;

import ProfissionaisDaSaude.DataProvider.Models.UserModel;
import ProfissionaisDaSaude.Pages.Identity.OnboardingPersonalDataPage;
import org.openqa.selenium.WebDriver;

public class OnboardingPersonalDataTasks {

    WebDriver driver;
    OnboardingPersonalDataPage onboardingPersonalDataPage;

    public OnboardingPersonalDataTasks(WebDriver driver) {
        this.driver = driver;
        this.onboardingPersonalDataPage = new OnboardingPersonalDataPage(this.driver);
    }

    public void fillFormWithUserModel(UserModel user) {
        this.onboardingPersonalDataPage.getTxtName().sendKeys(user.getName());
        this.onboardingPersonalDataPage.getTxtSurname().sendKeys(user.getSurname());
        this.onboardingPersonalDataPage.getTxtBirthdate().sendKeys(user.getBirthdate());
        this.onboardingPersonalDataPage.getTxtEmail().sendKeys(user.getEmail());
        this.onboardingPersonalDataPage.getTxtPhoneNumber().sendKeys(user.getPhoneNumber());
        this.onboardingPersonalDataPage.getSelRegisterCommunicationChannel().selectOption(user.getCommunicationChannel());
        this.onboardingPersonalDataPage.getCbTermsOfUse().check();
        this.onboardingPersonalDataPage.getBtnContinue().click();
    }

}
