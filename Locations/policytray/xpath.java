package policytray;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import policytraydotcom.policytray.browser;

public class xpath extends browser
{
@FindBy(xpath="//a[text()='Apply Online']")
private WebElement applyonline;
@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtFirstName']")
private WebElement firstname;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtLastName']")
private WebElement lastname;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_DDLDate']")
private WebElement date;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_DDLMonth']")
private WebElement month;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_DDLYear']")
private WebElement year;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlGender']")
private WebElement gender;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtAddress']")
private WebElement address;
@FindBy(xpath="//*[@name='ctl00$ContentPlaceHolder1$ddlCity']")
private WebElement city;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtMobileNo']")
private WebElement mobile;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtEmail']")
private WebElement email;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlPlan']")
private WebElement plan;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtSumAssured']")
private WebElement sumassured;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlPolicyTerm']")
private WebElement policyterm;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlPaymentMode']")
private WebElement paymentmode;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_imgApplyOnlineNext']")
private WebElement submit;
@FindBy(xpath="//*[text()='Maturity Calculator']")
private WebElement maturity;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_Calculator_TxtSumAssured']")
private WebElement sumassuredm;
@FindBy(xpath="//a[@href='get-recommended-plans']")
//@FindBy(xpath="//*[@id=\"product\"]/div/div/div[5]/a")
private WebElement recommendedplan;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtDOB']")
private WebElement Maurityage;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtIncome']")
private WebElement annualinc;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlGender']")
private WebElement maturitygender;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlMaritalStatus']")
private WebElement maturitystatus;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_btnGetPlans']")
private WebElement getplan;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_btnSelfTermPlanBuy']")
private WebElement buyplan;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtDOB']")
private WebElement dobcal;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlSmoker']")
private WebElement smoke;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtMobileno']")
private WebElement getmobile;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_btnNext']")
private WebElement getinsurancequote;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_dl1_btnPremium_1']")
private WebElement pnbins;
@FindBy(xpath="//*[@id='ContentPlaceHolder1_dl1_btnPremium_0']")
private WebElement icici;
@FindBy(xpath="/html/body/div[4]/div/div[1]/div[2]/div/div/form/div[3]/div[3]/div[2]/div[1]/label/span")
private WebElement yearlyinc;
@FindBy(xpath="//*[@name='user_dob']")
private WebElement insdob;
//@FindBy(xpath="//div[@class='lead-personal-details']//div[@class='form-group mobile leadpage-cmn-width']")
@FindBy(xpath="/html/body/div[4]/div/div[1]/div[2]/div/div/form/div[3]/div[7]/div[1]/input")
private WebElement insmobile;
//@FindBy(xpath="//*[@class='form-group email leadpage-cmn-width']")
@FindBy(xpath="/html/body/div[4]/div/div[1]/div[2]/div/div/form/div[3]/div[7]/div[2]/input")
private WebElement insemail;
@FindBy(xpath="/html/body/div[4]/div/div[1]/div[2]/div/div/form/div[3]/button")
private WebElement checkpremium;
//@FindBy(xpath="//div[@id='plan1']//div//button//span[text()='Proceed']")
@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/button/img")
private WebElement proceed;
@FindBy(xpath="//*[@id=\"proceedPop\"]/div/div/div/ul/li[4]/a")
private WebElement kyc;
@FindBy(xpath="//*[@class='express-head js-OTP-confirm']")
private WebElement confirm;
@FindBy(xpath="//a[text()='Skip']")
private WebElement skip;
@FindBy(xpath="//*[@id=\"city\"]")
private WebElement city1;
@FindBy(xpath="//*[@id=\"state\"]")
private WebElement state;
@FindBy(xpath="//*[@id=\"address1\"]")
private WebElement address1;
@FindBy(xpath="//*[@id=\"addCommunication0\"]")
private WebElement yes;
@FindBy(xpath="//*[@id=\"app-next-btn\"]")
private WebElement c1;
@FindBy(xpath="//*[@id=\"nomineefrstNm\"]")
private WebElement nomineefname;
@FindBy(xpath="//input[@id='nomineeDob']")
private WebElement nomineedob;
@FindBy(xpath="//input[@id='relationship5']")
private WebElement nomineers;
@FindBy(xpath="//input[@id='insuranceInfos1']")
private WebElement policyexist;
@FindBy(xpath="/html/body/custom-application-form/div[5]/div[3]/div[1]/div[3]/a")
private WebElement nextsection;
@FindBy(xpath="//input[@id='weight']")
private WebElement weight;
@FindBy(xpath="//div[@id='HealthDetails']/div[3]/div[2]/div[2]/a[text()='Next']")
private WebElement nextbutton;
@FindBy(xpath="//input[@id='feet']")
private WebElement feet;
@FindBy(xpath="//input[@id='inches']")
private WebElement inches;
@FindBy(xpath="//div[@id='HealthDetails']/div[3]/div[2]/div[2]/a[2]")
private WebElement nextbtn;
@FindBy(xpath="//*[@id=\"HQ071\"]")
private WebElement hq;
@FindBy(xpath="//input[@id='HQ061']")
private WebElement alc;
@FindBy(xpath="//input[@id='HQ1251']")
private WebElement milt;
@FindBy(xpath="//input[@id='HQ091']")
private WebElement haz;
@FindBy(xpath="//*[@id=\"HQ165\"]")
private WebElement diseases;
@FindBy(xpath="//a[@id='app-healthbtn']")
private WebElement healthbutton;
@FindBy(xpath="//input[@id='HQ1661']")
private WebElement treatment;
@FindBy(xpath="//*[@id='HQ241']")
private WebElement injury;
@FindBy(xpath="//input[@id='CHQ11']")
private WebElement covid19;
@FindBy(xpath="//input[@id='CHQ21']")
private WebElement isolate;
@FindBy(xpath="//input[@id='CHQ31']")
private WebElement selfisolate;
@FindBy(xpath="//input[@id='CHQ41']")
private WebElement cough;
public WebElement getCough() {
	return cough;
}
public void setCough(WebElement cough) {
	this.cough = cough;
}
public WebElement getSelfisolate() {
	return selfisolate;
}
public void setSelfisolate(WebElement selfisolate) {
	this.selfisolate = selfisolate;
}
public WebElement getIsolate() {
	return isolate;
}
public void setIsolate(WebElement isolate) {
	this.isolate = isolate;
}
public WebElement getCovid19() {
	return covid19;
}
public void setCovid19(WebElement covid19) {
	this.covid19 = covid19;
}
public WebElement getInjury() {
	return injury;
}
public void setInjury(WebElement injury) {
	this.injury = injury;
}
public WebElement getTreatment() {
	return treatment;
}
public void setTreatment(WebElement treatment) {
	this.treatment = treatment;
}
public WebElement getHealthbutton() {
	return healthbutton;
}
public void setHealthbutton(WebElement healthbutton) {
	this.healthbutton = healthbutton;
}
public WebElement getDiseases() {
	return diseases;
}
public void setDiseases(WebElement diseases) {
	this.diseases = diseases;
}
public WebElement getHaz() {
	return haz;
}
public void setHaz(WebElement haz) {
	this.haz = haz;
}
public WebElement getMilt() {
	return milt;
}
public void setMilt(WebElement milt) {
	this.milt = milt;
}
public WebElement getAlc() {
	return alc;
}
public void setAlc(WebElement alc) {
	this.alc = alc;
}
public WebElement getHq() {
	return hq;
}
public void setHq(WebElement hq) {
	this.hq = hq;
}
public WebElement getNextbtn() {
	return nextbtn;
}
public void setNextbtn(WebElement nextbtn) {
	this.nextbtn = nextbtn;
}
public WebElement getInches() {
	return inches;
}
public void setInches(WebElement inches) {
	this.inches = inches;
}
public WebElement getFeet() {
	return feet;
}
public void setFeet(WebElement feet) {
	this.feet = feet;
}
public WebElement getNextbutton() {
	return nextbutton;
}
public void setNextbutton(WebElement nextbutton) {
	this.nextbutton = nextbutton;
}
public WebElement getWeight() {
	return weight;
}
public void setWeight(WebElement weight) {
	this.weight = weight;
}
public WebElement getNextsection() {
	return nextsection;
}
public void setNextsection(WebElement nextsection) {
	this.nextsection = nextsection;
}
public WebElement getPolicyexist() {
	return policyexist;
}
public void setPolicyexist(WebElement policyexist) {
	this.policyexist = policyexist;
}
public WebElement getNomineers() {
	return nomineers;
}
public void setNomineers(WebElement nomineers) {
	this.nomineers = nomineers;
}
public WebElement getNomineedob() {
	return nomineedob;
}
public void setNomineedob(WebElement nomineedob) {
	this.nomineedob = nomineedob;
}
public WebElement getNomineefname() {
	return nomineefname;
}
public void setNomineefname(WebElement nomineefname) {
	this.nomineefname = nomineefname;
}
public WebElement getC1() {
	return c1;
}
public void setC1(WebElement c1) {
	this.c1 = c1;
}
public WebElement getYes() {
	return yes;
}
public void setYes(WebElement yes) {
	this.yes = yes;
}
public WebElement getAddress1() {
	return address1;
}
public void setAddress1(WebElement address1) {
	this.address1 = address1;
}
public WebElement getState() {
	return state;
}
public void setState(WebElement state) {
	this.state = state;
}
public WebElement getCity1() {
	return city1;
}
public void setCity1(WebElement city1) {
	this.city1 = city1;
}
public WebElement getSkip() {
	return skip;
}
public void setSkip(WebElement skip) {
	this.skip = skip;
}
@FindBy(xpath="//div[@id='LifeAssuredDetails']/div[3]/div[2]/ul/li/input")
private WebElement confirstname;
@FindBy(xpath="//div[@id='LifeAssuredDetails']/div[3]/div[2]/div/a[2]")
private WebElement connext;
@FindBy(xpath="//*[@id='LifeAssuredDetails']/div[3]/div[2]/ul/li[2]/div[2]/input")
private WebElement mstatus;
@FindBy(xpath="//*[@id='LifeAssuredDetails']/div[3]/div[2]/ul/li[3]/div/input")
private WebElement pg;
@FindBy(xpath="//*[@id='LifeAssuredDetails']/div[3]/div[2]/ul/li[4]/div/input")
private WebElement salaried;
@FindBy(xpath="//*[@id='LifeAssuredDetails']/div[3]/div[2]/ul/li[5]/input")
private WebElement organization;
@FindBy(xpath="//*[@id='LifeAssuredDetails']/div[3]/div[2]/div[2]/a[2]")
private WebElement nexxt;
@FindBy(xpath="//*[@id='LifeAssuredDetails']/div[3]/div[2]/ul/li[6]/div[3]/input")
private WebElement pvtltd;
@FindBy(xpath="//*[@id='LifeAssuredDetails']/div[3]/div[2]/ul/li[7]/input")
private WebElement pan;
@FindBy(xpath="//*[@id=\"app-next-btn\"]")
private WebElement confirm1;
@FindBy(xpath="//*[@id=\"politically_exposed_person1\"]")
private WebElement nos;
@FindBy(xpath="//*[@id='pinCode']")
private WebElement pin;
@FindBy(xpath="//*[@id=\"annIncme\"]")
private WebElement annuinc;
@FindBy(xpath="//*[@id=\"CHQ51\"]")
private WebElement closer;
@FindBy(xpath="//*[@id=\"app-next-btn\"]")
private WebElement skip1;
@FindBy(xpath="/html/body/custom-application-form/div[6]/div[3]/div[1]/div[3]/a[1]")
private WebElement uploaddoc;
@FindBy(xpath="/html/body/custom-application-form/div[16]/div/div/div/div[3]/a")
private WebElement proceedpayment;
@FindBy(xpath="//button[text()='I Agree']")
private WebElement agree;
public WebElement getAgree() {
	return agree;
}
public void setAgree(WebElement agree) {
	this.agree = agree;
}
public WebElement getProceedpayment() {
	return proceedpayment;
}
public void setProceedpayment(WebElement proceedpayment) {
	this.proceedpayment = proceedpayment;
}
public WebElement getUploaddoc() {
	return uploaddoc;
}
public void setUploaddoc(WebElement uploaddoc) {
	this.uploaddoc = uploaddoc;
}
public WebElement getSkip1() {
	return skip1;
}
public void setSkip1(WebElement skip1) {
	this.skip1 = skip1;
}
public WebElement getCloser() {
	return closer;
}
public void setCloser(WebElement closer) {
	this.closer = closer;
}
public WebElement getAnnuinc() {
	return annuinc;
}
public void setAnnuinc(WebElement annuinc) {
	this.annuinc = annuinc;
}
public WebElement getPin() {
	return pin;
}
public void setPin(WebElement pin) {
	this.pin = pin;
}
public WebElement getNos() {
	return nos;
}
public void setNos(WebElement nos) {
	this.nos = nos;
}
public WebElement getConfirm1() {
	return confirm1;
}
public void setConfirm1(WebElement confirm1) {
	this.confirm1 = confirm1;
}
public WebElement getPan() {
	return pan;
}
public void setPan(WebElement pan) {
	this.pan = pan;
}
public WebElement getPvtltd() {
	return pvtltd;
}
public void setPvtltd(WebElement pvtltd) {
	this.pvtltd = pvtltd;
}
public WebElement getNexxt() {
	return nexxt;
}
public void setNexxt(WebElement nexxt) {
	this.nexxt = nexxt;
}
public WebElement getOrganization() {
	return organization;
}
public void setOrganization(WebElement organization) {
	this.organization = organization;
}
public WebElement getSalaried() {
	return salaried;
}
public void setSalaried(WebElement salaried) {
	this.salaried = salaried;
}
public WebElement getPg() {
	return pg;
}
public void setPg(WebElement pg) {
	this.pg = pg;
}
public WebElement getMstatus() {
	return mstatus;
}
public void setMstatus(WebElement mstatus) {
	this.mstatus = mstatus;
}
public WebElement getConnext() {
	return connext;
}
public void setConnext(WebElement connext) {
	this.connext = connext;
}
public WebElement getConfirstname() {
	return confirstname;
}
public void setConfirstname(WebElement confirstname) {
	this.confirstname = confirstname;
}
public WebElement getConfirm() {
	return confirm;
}
public void setConfirm(WebElement confirm) {
	this.confirm = confirm;
}
public WebElement getKyc() {
	return kyc;
}
public void setKyc(WebElement kyc) {
	this.kyc = kyc;
}
public WebElement getCheckpremium() {
	return checkpremium;
}
public WebElement getProceed() {
	return proceed;
}
public void setProceed(WebElement proceed) {
	this.proceed = proceed;
}
public void setCheckpremium(WebElement checkpremium) {
	this.checkpremium = checkpremium;
}
public WebElement getInsemail() {
	return insemail;
}
public void setInsemail(WebElement insemail) {
	this.insemail = insemail;
}
public WebElement getInsmobile() {
	return insmobile;
}
public void setInsmobile(WebElement insmobile) {
	this.insmobile = insmobile;
}
public WebElement getInsdob() {
	return insdob;
}
public void setInsdob(WebElement insdob) {
	this.insdob = insdob;
}
public WebElement getYearlyinc() {
	return yearlyinc;
}
public void setYearlyinc(WebElement yearlyinc) {
	this.yearlyinc = yearlyinc;
}
public WebElement getIcici() {
	return icici;
}
public void setIcici(WebElement icici) {
	this.icici = icici;
}
public WebElement getPnbins() {
	return pnbins;
}
public void setPnbins(WebElement pnbins) {
	this.pnbins = pnbins;
}
public WebElement getGetmobile() {
	return getmobile;
}
public void setGetmobile(WebElement getmobile) {
	this.getmobile = getmobile;
}
public WebElement getGetinsurancequote() {
	return getinsurancequote;
}
public void setGetinsurancequote(WebElement getinsurancequote) {
	this.getinsurancequote = getinsurancequote;
}
public WebElement getSmoke() {
	return smoke;
}
public void setSmoke(WebElement smoke) {
	this.smoke = smoke;
}
public WebElement getDobcal() {
	return dobcal;
}
public void setDobcal(WebElement dobcal) {
	this.dobcal = dobcal;
}
public WebElement getBuyplan() {
	return buyplan;
}
public void setBuyplan(WebElement buyplan) {
	this.buyplan = buyplan;
}
public WebElement getGetplan() {
	return getplan;
}
public void setGetplan(WebElement getplan) {
	this.getplan = getplan;
}
public WebElement getRecommendedplan() {
	return recommendedplan;
}
public void setRecommendedplan(WebElement recommendedplan) {
	this.recommendedplan = recommendedplan;
}
public WebElement getMaturitystatus() {
	return maturitystatus;
}
public void setMaturitystatus(WebElement maturitystatus) {
	this.maturitystatus = maturitystatus;
}
public WebElement getMaturitygender() {
	return maturitygender;
}
public void setMaturitygender(WebElement maturitygender) {
	this.maturitygender = maturitygender;
}
public WebElement getAnnualinc() {
	return annualinc;
}
public void setAnnualinc(WebElement annualinc) {
	this.annualinc = annualinc;
}
public WebElement getMaurityage() {
	return Maurityage;
}
public void setMaurityage(WebElement maurityage) {
	Maurityage = maurityage;
}

public WebElement getSumassuredm() {
	return sumassuredm;
}
public void setSumassuredm(WebElement sumassuredm) {
	this.sumassuredm = sumassuredm;
}
@FindBy(xpath="//*[@id='ContentPlaceHolder1_Calculator_hypCoverNestRedirection']")
private WebElement checkplans;
public WebElement getCheckplans() {
	return checkplans;
}
public void setCheckplans(WebElement checkplans) {
	this.checkplans = checkplans;
}
public WebElement getMaturity() {
	return maturity;
}
public void setMaturity(WebElement maturity) {
	this.maturity = maturity;
}
public WebElement getApplyonline() {
	return applyonline;
}
public void setApplyonline(WebElement applyonline) {
	this.applyonline = applyonline;
}
public WebElement getFirstname() {
	return firstname;
}
public void setFirstname(WebElement firstname) {
	this.firstname = firstname;
}
public WebElement getLastname() {
	return lastname;
}
public void setLastname(WebElement lastname) {
	this.lastname = lastname;
}
public WebElement getDate() {
	return date;
}
public void setDate(WebElement date) {
	this.date = date;
}
public WebElement getMonth() {
	return month;
}
public void setMonth(WebElement month) {
	this.month = month;
}
public WebElement getYear() {
	return year;
}
public void setYear(WebElement year) {
	this.year = year;
}
public WebElement getGender() {
	return gender;
}
public void setGender(WebElement gender) {
	this.gender = gender;
}
public WebElement getAddress() {
	return address;
}
public void setAddress(WebElement address) {
	this.address = address;
}
public WebElement getCity() {
	return city;
}
public void setCity(WebElement city) {
	this.city = city;
}
public WebElement getMobile() {
	return mobile;
}
public void setMobile(WebElement mobile) {
	this.mobile = mobile;
}
public WebElement getEmail() {
	return email;
}
public void setEmail(WebElement email) {
	this.email = email;
}
public WebElement getPlan() {
	return plan;
}
public void setPlan(WebElement plan) {
	this.plan = plan;
}
public WebElement getSumassured() {
	return sumassured;
}
public void setSumassured(WebElement sumassured) {
	this.sumassured = sumassured;
}
public WebElement getPolicyterm() {
	return policyterm;
}
public void setPolicyterm(WebElement policyterm) {
	this.policyterm = policyterm;
}

public WebElement getPaymentmode() {
	return paymentmode;
}
public void setPaymentmode(WebElement paymentmode) {
	this.paymentmode = paymentmode;
}
public WebElement getSubmit() {
	return submit;
}
public void setSubmit(WebElement submit) {
	this.submit = submit;
}
public xpath()
{
PageFactory.initElements(driver,this);
}
}
