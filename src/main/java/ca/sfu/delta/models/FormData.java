package ca.sfu.delta.models;

import java.lang.String;
import java.util.Optional;
import java.util.List;

public class FormData {
    //Specified by user
    private String department;
    private String requesterName;
    private String phoneNumber;
    private String faxNumber;
    private String emailAddress;
    private String eventName;
    private String requesterID; //SFU ID or BCDL
    private String eventLocation; //String for now, until we have full list of possible locations.
    private Boolean isLicensed;
    private int numAttendees;
    private String times; //Unsure of how we want to store times, String for now.
	//Todo: these will need to be changed back to arrays of dates once the front end supports dates
    private String eventDates;
    private String requestedOnDate;

    private String paymentAccountCode;
    private Boolean invoiceRequested;
    private String eventDetails;
    private String serviceRequestNumber; //Generated automatically, pre-populate.
    private String recievingSecuritySupervisor;
    private List<Guard> guards; //Things like total billable and grand total can be calculated from these
    private List<String> distributionList;
    private String preparedBy;
    private String securityRemarks;

    public FormData() {

    }

    //Specified by Authorizer
    private String authorizerName;
    private String authorizerID; //SFU ID or BCDL
	//Todo: this will need to be changed back to a date once the front end supports dates
    private String authorizationDate;
    private String authorizerPhoneNumber;
    private Boolean isAuthorized;


    //Constructor takes all info that a requester can provide (optional or no)
    public FormData(
            String department,
            String dates,
            String requestorName,
            String requesterID,
            Optional<String> phoneNumber,
            Optional<String> faxNumber,
            String emailAddress,
            String requestedOnDate,
            String eventName,
            Boolean isLicensed,
            int numAttendees,
            String times,
            String paymentAccountCode,
            Boolean invoiceRequested,
            String eventDetails
    ){
        this.department = department;
    	this.eventDates = dates;
        this.requesterName = requestorName;
        this.phoneNumber = phoneNumber.orElse("Unspecified");
        this.faxNumber = faxNumber.orElse("Unspecified");
        this.emailAddress = emailAddress;
        this.requestedOnDate = requestedOnDate;
        this.eventName = eventName;
        this.requesterID = requesterID;
        this.isLicensed = isLicensed;
        this.numAttendees = numAttendees;
        this.times = times;
        this.paymentAccountCode = paymentAccountCode;
        this.invoiceRequested = invoiceRequested;
        this.eventDetails = eventDetails;
    }

    //Getter and Setter methods
    //Set by requester
    public String getEventDates() {
        return eventDates;
    }

    public void setEventDates(String newDates) {
        eventDates = newDates;
    }

    public String getDepartment() {
    	return department;
    }

    public void setDepartment(String newDepartment) {
    	department = newDepartment;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String newName) {
        requesterName = newName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String newNumber) {
        phoneNumber = newNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String newNumber) {
        faxNumber = newNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String newEmail) {
        emailAddress = newEmail;
    }

    public String getRequestedOnDate() {
        return requestedOnDate;
    }

    public void setRequestedOnDate(String newDate) {
        requestedOnDate = newDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String newEventLocation) {
        eventLocation = newEventLocation;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String newEventName) {
        eventName = newEventName;
    }

    public String getRequesterID() {
        return requesterID;
    }

    public void setRequesterID(String newRequesterID) {
        requesterID = newRequesterID;
    }

	public Boolean getIsLicensed() {
		return isLicensed;
	}

	public void setIsLicensed(Boolean licensed) {
        isLicensed = licensed;
    }

    public int getNumAttendees() {
        return numAttendees;
    }

    public void setNumAttendees(int newNumAttendees) {
        numAttendees = newNumAttendees;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String newTimes) {
        times = newTimes;
    }

    public String getPaymentAccountCode() {
        return paymentAccountCode;
    }

    public void setPaymentAccountCode(String newPaymentAccountCode) {
        paymentAccountCode = newPaymentAccountCode;
    }

    public Boolean getInvoiceRequested() {
        return invoiceRequested;
    }

    public void setInvoiceRequested(Boolean newInvoiceRequested) {
        invoiceRequested = newInvoiceRequested;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String newEventDetails) {
        this.eventDetails = newEventDetails;
    }

    public String getAuthorizerID() {
    	return authorizerID;
    }

    public void setAuthorizerID(String newAuthorizerID) {
    	authorizerID = newAuthorizerID;
    }

	public String getAuthorizerPhoneNumber() {
		return authorizerPhoneNumber;
	}

	public void setAuthorizerPhoneNumber(String newAuthorizerPhoneNumber) {
		authorizerPhoneNumber = newAuthorizerPhoneNumber;
	}

	public String getAuthorizerName() {
    	return authorizerName;
	}

	public void setAuthorizerName(String newAuthorizerName) {
		authorizerName = newAuthorizerName;
	}

	public String getAuthorizationDate() {
    	return authorizationDate;
	}

	public void setAuthorizationDate(String newAuthorizationDate) {
    	authorizationDate = newAuthorizationDate;
	}

    public void setAuthorizationFields(String authorizerName, String authorizerID, String authorizationDate, String authorizerPhoneNumber){
        this.authorizerName = authorizerName;
        this.authorizerID = authorizerID;
        this.authorizationDate = authorizationDate;
        this.authorizerPhoneNumber = authorizerPhoneNumber;
        this.isAuthorized = true;
    }

    public Boolean getIsAuthorized(){
        return isAuthorized;
    }

    public void setServiceRequestNumber(String newNumber){
    	serviceRequestNumber = newNumber;
    }

    public String getServiceRequestNumber(){
    	return serviceRequestNumber;
    }

    public String getRecievingSecuritySupervisor(){
    	return recievingSecuritySupervisor;
    }

    public List<Guard> getGuards(){
    	return guards;
    }

    public List<String> getDistributionList(){
    	return distributionList;
    }

    public String getPreparedBy(){
    	return preparedBy;
    }

    public String getSecurityRemarks(){
    	return securityRemarks;
    }

    public void setSecurityFields(String recievingSecuritySupervisor, List<Guard> guards, List<String> distributionList,
    							  String preparedBy, String securityRemarks){
    	this.recievingSecuritySupervisor = recievingSecuritySupervisor;
    	this.guards = guards;
    	this.distributionList = distributionList;
    	this.preparedBy = preparedBy;
    	this.securityRemarks = securityRemarks;
    }

    @Override
    public String toString() {
        return "FormData{" +
                "department='" + department + '\'' +
                ", requesterName='" + requesterName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", eventName='" + eventName + '\'' +
                ", requesterID='" + requesterID + '\'' +
                ", eventLocation='" + eventLocation + '\'' +
                ", isLicensed=" + isLicensed +
                ", numAttendees=" + numAttendees +
                ", times='" + times + '\'' +
                ", eventDates='" + eventDates + '\'' +
                ", requestedOnDate='" + requestedOnDate + '\'' +
                ", paymentAccountCode='" + paymentAccountCode + '\'' +
                ", invoiceRequested=" + invoiceRequested +
                ", eventDetails='" + eventDetails + '\'' +
                ", serviceRequestNumber='" + serviceRequestNumber + '\'' +
                ", recievingSecuritySupervisor='" + recievingSecuritySupervisor + '\'' +
                ", guards=" + guards +
                ", distributionList=" + distributionList +
                ", preparedBy='" + preparedBy + '\'' +
                ", securityRemarks='" + securityRemarks + '\'' +
                ", authorizerName='" + authorizerName + '\'' +
                ", authorizerID='" + authorizerID + '\'' +
                ", authorizationDate='" + authorizationDate + '\'' +
                ", authorizerPhoneNumber='" + authorizerPhoneNumber + '\'' +
                ", isAuthorized=" + isAuthorized +
                '}';
    }
}
