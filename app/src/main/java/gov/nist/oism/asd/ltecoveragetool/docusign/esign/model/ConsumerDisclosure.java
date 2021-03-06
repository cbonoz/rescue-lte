package gov.nist.oism.asd.ltecoveragetool.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ConsumerDisclosure implements Serializable {

    @SerializedName("accountEsignId")
    private String accountEsignId = null;

    @SerializedName("allowCDWithdraw")
    private String allowCDWithdraw = null;

    @SerializedName("changeEmail")
    private String changeEmail = null;

    @SerializedName("changeEmailOther")
    private String changeEmailOther = null;

    @SerializedName("companyName")
    private String companyName = null;

    @SerializedName("companyPhone")
    private String companyPhone = null;

    @SerializedName("copyCostPerPage")
    private String copyCostPerPage = null;

    @SerializedName("copyFeeCollectionMethod")
    private String copyFeeCollectionMethod = null;

    @SerializedName("copyRequestEmail")
    private String copyRequestEmail = null;

    @SerializedName("custom")
    private String custom = null;

    @SerializedName("enableEsign")
    private String enableEsign = null;

    @SerializedName("esignAgreement")
    private String esignAgreement = null;

    @SerializedName("esignText")
    private String esignText = null;

    @SerializedName("languageCode")
    private String languageCode = null;

    @SerializedName("mustAgreeToEsign")
    private String mustAgreeToEsign = null;

    @SerializedName("pdfId")
    private String pdfId = null;

    @SerializedName("useBrand")
    private String useBrand = null;

    @SerializedName("useConsumerDisclosureWithinAccount")
    private String useConsumerDisclosureWithinAccount = null;

    @SerializedName("withdrawAddressLine1")
    private String withdrawAddressLine1 = null;

    @SerializedName("withdrawAddressLine2")
    private String withdrawAddressLine2 = null;

    @SerializedName("withdrawByEmail")
    private String withdrawByEmail = null;

    @SerializedName("withdrawByMail")
    private String withdrawByMail = null;

    @SerializedName("withdrawByPhone")
    private String withdrawByPhone = null;

    @SerializedName("withdrawCity")
    private String withdrawCity = null;

    @SerializedName("withdrawConsequences")
    private String withdrawConsequences = null;

    @SerializedName("withdrawEmail")
    private String withdrawEmail = null;

    @SerializedName("withdrawOther")
    private String withdrawOther = null;

    @SerializedName("withdrawPhone")
    private String withdrawPhone = null;

    @SerializedName("withdrawPostalCode")
    private String withdrawPostalCode = null;

    @SerializedName("withdrawState")
    private String withdrawState = null;


    /**
     * A GUID identifying the account associated with the consumer disclosure
     **/
    @ApiModelProperty(value = "A GUID identifying the account associated with the consumer disclosure")
    public String getAccountEsignId() {
        return accountEsignId;
    }

    public void setAccountEsignId(String accountEsignId) {
        this.accountEsignId = accountEsignId;
    }


    /**
     * Indicates whether the customer can withdraw their acceptance of the consumer disclosure.
     **/
    @ApiModelProperty(value = "Indicates whether the customer can withdraw their acceptance of the consumer disclosure.")
    public String getAllowCDWithdraw() {
        return allowCDWithdraw;
    }

    public void setAllowCDWithdraw(String allowCDWithdraw) {
        this.allowCDWithdraw = allowCDWithdraw;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getChangeEmail() {
        return changeEmail;
    }

    public void setChangeEmail(String changeEmail) {
        this.changeEmail = changeEmail;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getChangeEmailOther() {
        return changeEmailOther;
    }

    public void setChangeEmailOther(String changeEmailOther) {
        this.changeEmailOther = changeEmailOther;
    }


    /**
     * The name of the company associated with the consumer disclosure.
     **/
    @ApiModelProperty(value = "The name of the company associated with the consumer disclosure.")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * The phone number of the company associated with the consumer disclosure.
     **/
    @ApiModelProperty(value = "The phone number of the company associated with the consumer disclosure.")
    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCopyCostPerPage() {
        return copyCostPerPage;
    }

    public void setCopyCostPerPage(String copyCostPerPage) {
        this.copyCostPerPage = copyCostPerPage;
    }


    /**
     * Specifies the fee collection method for cases in which the customer requires paper copies of the document.\n\nMaximum Length: 255 characters
     **/
    @ApiModelProperty(value = "Specifies the fee collection method for cases in which the customer requires paper copies of the document.\n\nMaximum Length: 255 characters")
    public String getCopyFeeCollectionMethod() {
        return copyFeeCollectionMethod;
    }

    public void setCopyFeeCollectionMethod(String copyFeeCollectionMethod) {
        this.copyFeeCollectionMethod = copyFeeCollectionMethod;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCopyRequestEmail() {
        return copyRequestEmail;
    }

    public void setCopyRequestEmail(String copyRequestEmail) {
        this.copyRequestEmail = copyRequestEmail;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEnableEsign() {
        return enableEsign;
    }

    public void setEnableEsign(String enableEsign) {
        this.enableEsign = enableEsign;
    }


    /**
     * The Electronic Record and Signature Disclosure text. The disclosure text includes the html formatting.
     **/
    @ApiModelProperty(value = "The Electronic Record and Signature Disclosure text. The disclosure text includes the html formatting.")
    public String getEsignAgreement() {
        return esignAgreement;
    }

    public void setEsignAgreement(String esignAgreement) {
        this.esignAgreement = esignAgreement;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEsignText() {
        return esignText;
    }

    public void setEsignText(String esignText) {
        this.esignText = esignText;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getMustAgreeToEsign() {
        return mustAgreeToEsign;
    }

    public void setMustAgreeToEsign(String mustAgreeToEsign) {
        this.mustAgreeToEsign = mustAgreeToEsign;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPdfId() {
        return pdfId;
    }

    public void setPdfId(String pdfId) {
        this.pdfId = pdfId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUseBrand() {
        return useBrand;
    }

    public void setUseBrand(String useBrand) {
        this.useBrand = useBrand;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUseConsumerDisclosureWithinAccount() {
        return useConsumerDisclosureWithinAccount;
    }

    public void setUseConsumerDisclosureWithinAccount(String useConsumerDisclosureWithinAccount) {
        this.useConsumerDisclosureWithinAccount = useConsumerDisclosureWithinAccount;
    }


    /**
     * Contains the first address line of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.
     **/
    @ApiModelProperty(value = "Contains the first address line of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters. ")
    public String getWithdrawAddressLine1() {
        return withdrawAddressLine1;
    }

    public void setWithdrawAddressLine1(String withdrawAddressLine1) {
        this.withdrawAddressLine1 = withdrawAddressLine1;
    }


    /**
     * Contains the second address line of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.
     **/
    @ApiModelProperty(value = "Contains the second address line of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters. ")
    public String getWithdrawAddressLine2() {
        return withdrawAddressLine2;
    }

    public void setWithdrawAddressLine2(String withdrawAddressLine2) {
        this.withdrawAddressLine2 = withdrawAddressLine2;
    }


    /**
     * Indicates whether the customer can withdraw consent by email.
     **/
    @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by email.")
    public String getWithdrawByEmail() {
        return withdrawByEmail;
    }

    public void setWithdrawByEmail(String withdrawByEmail) {
        this.withdrawByEmail = withdrawByEmail;
    }


    /**
     * Indicates whether the customer can withdraw consent by postal mail.
     **/
    @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by postal mail.")
    public String getWithdrawByMail() {
        return withdrawByMail;
    }

    public void setWithdrawByMail(String withdrawByMail) {
        this.withdrawByMail = withdrawByMail;
    }


    /**
     * Indicates whether the customer can withdraw consent by phone.
     **/
    @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by phone.")
    public String getWithdrawByPhone() {
        return withdrawByPhone;
    }

    public void setWithdrawByPhone(String withdrawByPhone) {
        this.withdrawByPhone = withdrawByPhone;
    }


    /**
     * Contains the city of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 50 characters.
     **/
    @ApiModelProperty(value = "Contains the city of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 50 characters. ")
    public String getWithdrawCity() {
        return withdrawCity;
    }

    public void setWithdrawCity(String withdrawCity) {
        this.withdrawCity = withdrawCity;
    }


    /**
     * Indicates the consequences of withdrawing consent.
     **/
    @ApiModelProperty(value = "Indicates the consequences of withdrawing consent.")
    public String getWithdrawConsequences() {
        return withdrawConsequences;
    }

    public void setWithdrawConsequences(String withdrawConsequences) {
        this.withdrawConsequences = withdrawConsequences;
    }


    /**
     * Contains the email address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.
     **/
    @ApiModelProperty(value = "Contains the email address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters. ")
    public String getWithdrawEmail() {
        return withdrawEmail;
    }

    public void setWithdrawEmail(String withdrawEmail) {
        this.withdrawEmail = withdrawEmail;
    }


    /**
     * Indicates other information need to withdraw consent.\n\nMaximum length: 255 characters.
     **/
    @ApiModelProperty(value = "Indicates other information need to withdraw consent.\n\nMaximum length: 255 characters.")
    public String getWithdrawOther() {
        return withdrawOther;
    }

    public void setWithdrawOther(String withdrawOther) {
        this.withdrawOther = withdrawOther;
    }


    /**
     * Contains the phone number which a customer can call to register consent withdrawal notification.\n\nMaximum length: 20 characters.
     **/
    @ApiModelProperty(value = "Contains the phone number which a customer can call to register consent withdrawal notification.\n\nMaximum length: 20 characters. ")
    public String getWithdrawPhone() {
        return withdrawPhone;
    }

    public void setWithdrawPhone(String withdrawPhone) {
        this.withdrawPhone = withdrawPhone;
    }


    /**
     * Contains the postal code of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 20 characters.
     **/
    @ApiModelProperty(value = "Contains the postal code of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 20 characters. ")
    public String getWithdrawPostalCode() {
        return withdrawPostalCode;
    }

    public void setWithdrawPostalCode(String withdrawPostalCode) {
        this.withdrawPostalCode = withdrawPostalCode;
    }


    /**
     * Contains the state of the postal address to which a customer can send a consent withdrawal notification.
     **/
    @ApiModelProperty(value = "Contains the state of the postal address to which a customer can send a consent withdrawal notification.")
    public String getWithdrawState() {
        return withdrawState;
    }

    public void setWithdrawState(String withdrawState) {
        this.withdrawState = withdrawState;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsumerDisclosure consumerDisclosure = (ConsumerDisclosure) o;
        return Objects.equals(accountEsignId, consumerDisclosure.accountEsignId) &&
                Objects.equals(allowCDWithdraw, consumerDisclosure.allowCDWithdraw) &&
                Objects.equals(changeEmail, consumerDisclosure.changeEmail) &&
                Objects.equals(changeEmailOther, consumerDisclosure.changeEmailOther) &&
                Objects.equals(companyName, consumerDisclosure.companyName) &&
                Objects.equals(companyPhone, consumerDisclosure.companyPhone) &&
                Objects.equals(copyCostPerPage, consumerDisclosure.copyCostPerPage) &&
                Objects.equals(copyFeeCollectionMethod, consumerDisclosure.copyFeeCollectionMethod) &&
                Objects.equals(copyRequestEmail, consumerDisclosure.copyRequestEmail) &&
                Objects.equals(custom, consumerDisclosure.custom) &&
                Objects.equals(enableEsign, consumerDisclosure.enableEsign) &&
                Objects.equals(esignAgreement, consumerDisclosure.esignAgreement) &&
                Objects.equals(esignText, consumerDisclosure.esignText) &&
                Objects.equals(languageCode, consumerDisclosure.languageCode) &&
                Objects.equals(mustAgreeToEsign, consumerDisclosure.mustAgreeToEsign) &&
                Objects.equals(pdfId, consumerDisclosure.pdfId) &&
                Objects.equals(useBrand, consumerDisclosure.useBrand) &&
                Objects.equals(useConsumerDisclosureWithinAccount, consumerDisclosure.useConsumerDisclosureWithinAccount) &&
                Objects.equals(withdrawAddressLine1, consumerDisclosure.withdrawAddressLine1) &&
                Objects.equals(withdrawAddressLine2, consumerDisclosure.withdrawAddressLine2) &&
                Objects.equals(withdrawByEmail, consumerDisclosure.withdrawByEmail) &&
                Objects.equals(withdrawByMail, consumerDisclosure.withdrawByMail) &&
                Objects.equals(withdrawByPhone, consumerDisclosure.withdrawByPhone) &&
                Objects.equals(withdrawCity, consumerDisclosure.withdrawCity) &&
                Objects.equals(withdrawConsequences, consumerDisclosure.withdrawConsequences) &&
                Objects.equals(withdrawEmail, consumerDisclosure.withdrawEmail) &&
                Objects.equals(withdrawOther, consumerDisclosure.withdrawOther) &&
                Objects.equals(withdrawPhone, consumerDisclosure.withdrawPhone) &&
                Objects.equals(withdrawPostalCode, consumerDisclosure.withdrawPostalCode) &&
                Objects.equals(withdrawState, consumerDisclosure.withdrawState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountEsignId, allowCDWithdraw, changeEmail, changeEmailOther, companyName, companyPhone, copyCostPerPage, copyFeeCollectionMethod, copyRequestEmail, custom, enableEsign, esignAgreement, esignText, languageCode, mustAgreeToEsign, pdfId, useBrand, useConsumerDisclosureWithinAccount, withdrawAddressLine1, withdrawAddressLine2, withdrawByEmail, withdrawByMail, withdrawByPhone, withdrawCity, withdrawConsequences, withdrawEmail, withdrawOther, withdrawPhone, withdrawPostalCode, withdrawState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumerDisclosure {\n");

        sb.append("    accountEsignId: ").append(toIndentedString(accountEsignId)).append("\n");
        sb.append("    allowCDWithdraw: ").append(toIndentedString(allowCDWithdraw)).append("\n");
        sb.append("    changeEmail: ").append(toIndentedString(changeEmail)).append("\n");
        sb.append("    changeEmailOther: ").append(toIndentedString(changeEmailOther)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    companyPhone: ").append(toIndentedString(companyPhone)).append("\n");
        sb.append("    copyCostPerPage: ").append(toIndentedString(copyCostPerPage)).append("\n");
        sb.append("    copyFeeCollectionMethod: ").append(toIndentedString(copyFeeCollectionMethod)).append("\n");
        sb.append("    copyRequestEmail: ").append(toIndentedString(copyRequestEmail)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    enableEsign: ").append(toIndentedString(enableEsign)).append("\n");
        sb.append("    esignAgreement: ").append(toIndentedString(esignAgreement)).append("\n");
        sb.append("    esignText: ").append(toIndentedString(esignText)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    mustAgreeToEsign: ").append(toIndentedString(mustAgreeToEsign)).append("\n");
        sb.append("    pdfId: ").append(toIndentedString(pdfId)).append("\n");
        sb.append("    useBrand: ").append(toIndentedString(useBrand)).append("\n");
        sb.append("    useConsumerDisclosureWithinAccount: ").append(toIndentedString(useConsumerDisclosureWithinAccount)).append("\n");
        sb.append("    withdrawAddressLine1: ").append(toIndentedString(withdrawAddressLine1)).append("\n");
        sb.append("    withdrawAddressLine2: ").append(toIndentedString(withdrawAddressLine2)).append("\n");
        sb.append("    withdrawByEmail: ").append(toIndentedString(withdrawByEmail)).append("\n");
        sb.append("    withdrawByMail: ").append(toIndentedString(withdrawByMail)).append("\n");
        sb.append("    withdrawByPhone: ").append(toIndentedString(withdrawByPhone)).append("\n");
        sb.append("    withdrawCity: ").append(toIndentedString(withdrawCity)).append("\n");
        sb.append("    withdrawConsequences: ").append(toIndentedString(withdrawConsequences)).append("\n");
        sb.append("    withdrawEmail: ").append(toIndentedString(withdrawEmail)).append("\n");
        sb.append("    withdrawOther: ").append(toIndentedString(withdrawOther)).append("\n");
        sb.append("    withdrawPhone: ").append(toIndentedString(withdrawPhone)).append("\n");
        sb.append("    withdrawPostalCode: ").append(toIndentedString(withdrawPostalCode)).append("\n");
        sb.append("    withdrawState: ").append(toIndentedString(withdrawState)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
