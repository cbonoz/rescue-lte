package gov.nist.oism.asd.ltecoveragetool.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains shared access information.
 **/
@ApiModel(description = "Contains shared access information.")
public class AccountSharedAccess implements Serializable {

    @SerializedName("accountId")
    private String accountId = null;

    @SerializedName("endPosition")
    private String endPosition = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("nextUri")
    private String nextUri = null;

    @SerializedName("previousUri")
    private String previousUri = null;

    @SerializedName("resultSetSize")
    private String resultSetSize = null;

    @SerializedName("sharedAccess")
    private java.util.List<MemberSharedItems> sharedAccess = new java.util.ArrayList<MemberSharedItems>();

    @SerializedName("startPosition")
    private String startPosition = null;

    @SerializedName("totalSetSize")
    private String totalSetSize = null;


    /**
     * The account ID associated with the envelope.
     **/
    @ApiModelProperty(value = "The account ID associated with the envelope.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * The last position in the result set.
     **/
    @ApiModelProperty(value = "The last position in the result set. ")
    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.
     **/
    @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
    public String getNextUri() {
        return nextUri;
    }

    public void setNextUri(String nextUri) {
        this.nextUri = nextUri;
    }


    /**
     * The postal code for the billing address.
     **/
    @ApiModelProperty(value = "The postal code for the billing address.")
    public String getPreviousUri() {
        return previousUri;
    }

    public void setPreviousUri(String previousUri) {
        this.previousUri = previousUri;
    }


    /**
     * The number of results returned in this response.
     **/
    @ApiModelProperty(value = "The number of results returned in this response. ")
    public String getResultSetSize() {
        return resultSetSize;
    }

    public void setResultSetSize(String resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * A complex type containing the shared access information to an envelope for the users specified in the request.
     **/
    @ApiModelProperty(value = "A complex type containing the shared access information to an envelope for the users specified in the request.")
    public java.util.List<MemberSharedItems> getSharedAccess() {
        return sharedAccess;
    }

    public void setSharedAccess(java.util.List<MemberSharedItems> sharedAccess) {
        this.sharedAccess = sharedAccess;
    }


    /**
     * Starting position of the current result set.
     **/
    @ApiModelProperty(value = "Starting position of the current result set.")
    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }


    /**
     * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
     **/
    @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
    public String getTotalSetSize() {
        return totalSetSize;
    }

    public void setTotalSetSize(String totalSetSize) {
        this.totalSetSize = totalSetSize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountSharedAccess accountSharedAccess = (AccountSharedAccess) o;
        return Objects.equals(accountId, accountSharedAccess.accountId) &&
                Objects.equals(endPosition, accountSharedAccess.endPosition) &&
                Objects.equals(errorDetails, accountSharedAccess.errorDetails) &&
                Objects.equals(nextUri, accountSharedAccess.nextUri) &&
                Objects.equals(previousUri, accountSharedAccess.previousUri) &&
                Objects.equals(resultSetSize, accountSharedAccess.resultSetSize) &&
                Objects.equals(sharedAccess, accountSharedAccess.sharedAccess) &&
                Objects.equals(startPosition, accountSharedAccess.startPosition) &&
                Objects.equals(totalSetSize, accountSharedAccess.totalSetSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, endPosition, errorDetails, nextUri, previousUri, resultSetSize, sharedAccess, startPosition, totalSetSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountSharedAccess {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
        sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
        sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
        sb.append("    sharedAccess: ").append(toIndentedString(sharedAccess)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
        sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
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