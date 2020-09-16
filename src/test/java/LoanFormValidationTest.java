import static logger.TestLogger.info;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.pages.LandingPage;
import page_objects.forms.LoanForm;

public class LoanFormValidationTest extends BaseTest {

  private LandingPage landingPage;
  private LoanForm loanForm;

  @BeforeMethod
  public void setUp() {
    landingPage = new LandingPage();
    landingPage.open(EN_URL);
  }

  @Test
  public void test(){
    info("Navigate to Loan form");
    loanForm = landingPage.openLoanForm();
    info("User try to submit Loan form");
    loanForm.submitLoanForm();
    info("Full name, phone, fin and card inputs are colored in red");
    loanForm.verifyInputsBorderColor();
  }
}
