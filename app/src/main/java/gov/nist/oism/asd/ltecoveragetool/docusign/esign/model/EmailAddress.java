package gov.nist.oism.asd.ltecoveragetool.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EmailAddress implements Serializable {

    @SerializedName("anchorCaseSensitive")
    private String anchorCaseSensitive = null;

    @SerializedName("anchorHorizontalAlignment")
    private String anchorHorizontalAlignment = null;

    @SerializedName("anchorIgnoreIfNotPresent")
    private String anchorIgnoreIfNotPresent = null;

    @SerializedName("anchorMatchWholeWord")
    private String anchorMatchWholeWord = null;

    @SerializedName("anchorString")
    private String anchorString = null;

    @SerializedName("anchorUnits")
    private String anchorUnits = null;

    @SerializedName("anchorXOffset")
    private String anchorXOffset = null;

    @SerializedName("anchorYOffset")
    private String anchorYOffset = null;

    @SerializedName("bold")
    private String bold = null;

    @SerializedName("conditionalParentLabel")
    private String conditionalParentLabel = null;

    @SerializedName("conditionalParentValue")
    private String conditionalParentValue = null;

    @SerializedName("customTabId")
    private String customTabId = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("font")
    private String font = null;

    @SerializedName("fontColor")
    private String fontColor = null;

    @SerializedName("fontSize")
    private String fontSize = null;

    @SerializedName("italic")
    private String italic = null;

    @SerializedName("mergeField")
    private MergeField mergeField = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("pageNumber")
    private String pageNumber = null;

    @SerializedName("recipientId")
    private String recipientId = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("tabId")
    private String tabId = null;

    @SerializedName("tabLabel")
    private String tabLabel = null;

    @SerializedName("tabOrder")
    private String tabOrder = null;

    @SerializedName("templateLocked")
    private String templateLocked = null;

    @SerializedName("templateRequired")
    private String templateRequired = null;

    @SerializedName("underline")
    private String underline = null;

    @SerializedName("xPosition")
    private String xPosition = null;

    @SerializedName("yPosition")
    private String yPosition = null;


    /**
     * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
     **/
    @ApiModelProperty(value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
    public String getAnchorCaseSensitive() {
        return anchorCaseSensitive;
    }

    public void setAnchorCaseSensitive(String anchorCaseSensitive) {
        this.anchorCaseSensitive = anchorCaseSensitive;
    }


    /**
     * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
     **/
    @ApiModelProperty(value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
    public String getAnchorHorizontalAlignment() {
        return anchorHorizontalAlignment;
    }

    public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
        this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    }


    /**
     * When set to **true**, this tab is ignored if anchorString is not found in the document.
     **/
    @ApiModelProperty(value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
    public String getAnchorIgnoreIfNotPresent() {
        return anchorIgnoreIfNotPresent;
    }

    public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
        this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    }


    /**
     * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
     **/
    @ApiModelProperty(value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
    public String getAnchorMatchWholeWord() {
        return anchorMatchWholeWord;
    }

    public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
        this.anchorMatchWholeWord = anchorMatchWholeWord;
    }


    /**
     * Anchor text information for a radio button.
     **/
    @ApiModelProperty(value = "Anchor text information for a radio button.")
    public String getAnchorString() {
        return anchorString;
    }

    public void setAnchorString(String anchorString) {
        this.anchorString = anchorString;
    }


    /**
     * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
     **/
    @ApiModelProperty(value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
    public String getAnchorUnits() {
        return anchorUnits;
    }

    public void setAnchorUnits(String anchorUnits) {
        this.anchorUnits = anchorUnits;
    }


    /**
     * Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.
     **/
    @ApiModelProperty(value = "Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.")
    public String getAnchorXOffset() {
        return anchorXOffset;
    }

    public void setAnchorXOffset(String anchorXOffset) {
        this.anchorXOffset = anchorXOffset;
    }


    /**
     * Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.
     **/
    @ApiModelProperty(value = "Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.")
    public String getAnchorYOffset() {
        return anchorYOffset;
    }

    public void setAnchorYOffset(String anchorYOffset) {
        this.anchorYOffset = anchorYOffset;
    }


    /**
     * When set to **true**, the information in the tab is bold.
     **/
    @ApiModelProperty(value = "When set to **true**, the information in the tab is bold.")
    public String getBold() {
        return bold;
    }

    public void setBold(String bold) {
        this.bold = bold;
    }


    /**
     * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
     **/
    @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
    public String getConditionalParentLabel() {
        return conditionalParentLabel;
    }

    public void setConditionalParentLabel(String conditionalParentLabel) {
        this.conditionalParentLabel = conditionalParentLabel;
    }


    /**
     * For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n
     **/
    @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n")
    public String getConditionalParentValue() {
        return conditionalParentValue;
    }

    public void setConditionalParentValue(String conditionalParentValue) {
        this.conditionalParentValue = conditionalParentValue;
    }


    /**
     * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.
     **/
    @ApiModelProperty(value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
    public String getCustomTabId() {
        return customTabId;
    }

    public void setCustomTabId(String customTabId) {
        this.customTabId = customTabId;
    }


    /**
     * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
     **/
    @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
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
     * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.
     **/
    @ApiModelProperty(value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }


    /**
     * The font color used for the information in the tab.\n\nPossible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.
     **/
    @ApiModelProperty(value = "The font color used for the information in the tab.\n\nPossible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }


    /**
     * The font size used for the information in the tab.\n\nPossible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.
     **/
    @ApiModelProperty(value = "The font size used for the information in the tab.\n\nPossible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }


    /**
     * When set to **true**, the information in the tab is italic.
     **/
    @ApiModelProperty(value = "When set to **true**, the information in the tab is italic.")
    public String getItalic() {
        return italic;
    }

    public void setItalic(String italic) {
        this.italic = italic;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public MergeField getMergeField() {
        return mergeField;
    }

    public void setMergeField(MergeField mergeField) {
        this.mergeField = mergeField;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Specifies the page number on which the tab is located.
     **/
    @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
     **/
    @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }


    /**
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. \n\n \n
     **/
    @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. \n\n \n")
    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }


    /**
     * The label string associated with the tab.
     **/
    @ApiModelProperty(value = "The label string associated with the tab.")
    public String getTabLabel() {
        return tabLabel;
    }

    public void setTabLabel(String tabLabel) {
        this.tabLabel = tabLabel;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTabOrder() {
        return tabOrder;
    }

    public void setTabOrder(String tabOrder) {
        this.tabOrder = tabOrder;
    }


    /**
     * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
    public String getTemplateLocked() {
        return templateLocked;
    }

    public void setTemplateLocked(String templateLocked) {
        this.templateLocked = templateLocked;
    }


    /**
     * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
    public String getTemplateRequired() {
        return templateRequired;
    }

    public void setTemplateRequired(String templateRequired) {
        this.templateRequired = templateRequired;
    }


    /**
     * When set to **true**, the information in the tab is underlined.
     **/
    @ApiModelProperty(value = "When set to **true**, the information in the tab is underlined.")
    public String getUnderline() {
        return underline;
    }

    public void setUnderline(String underline) {
        this.underline = underline;
    }


    /**
     * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
     **/
    @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
    public String getXPosition() {
        return xPosition;
    }

    public void setXPosition(String xPosition) {
        this.xPosition = xPosition;
    }


    /**
     * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
     **/
    @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
    public String getYPosition() {
        return yPosition;
    }

    public void setYPosition(String yPosition) {
        this.yPosition = yPosition;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailAddress emailAddress = (EmailAddress) o;
        return Objects.equals(anchorCaseSensitive, emailAddress.anchorCaseSensitive) &&
                Objects.equals(anchorHorizontalAlignment, emailAddress.anchorHorizontalAlignment) &&
                Objects.equals(anchorIgnoreIfNotPresent, emailAddress.anchorIgnoreIfNotPresent) &&
                Objects.equals(anchorMatchWholeWord, emailAddress.anchorMatchWholeWord) &&
                Objects.equals(anchorString, emailAddress.anchorString) &&
                Objects.equals(anchorUnits, emailAddress.anchorUnits) &&
                Objects.equals(anchorXOffset, emailAddress.anchorXOffset) &&
                Objects.equals(anchorYOffset, emailAddress.anchorYOffset) &&
                Objects.equals(bold, emailAddress.bold) &&
                Objects.equals(conditionalParentLabel, emailAddress.conditionalParentLabel) &&
                Objects.equals(conditionalParentValue, emailAddress.conditionalParentValue) &&
                Objects.equals(customTabId, emailAddress.customTabId) &&
                Objects.equals(documentId, emailAddress.documentId) &&
                Objects.equals(errorDetails, emailAddress.errorDetails) &&
                Objects.equals(font, emailAddress.font) &&
                Objects.equals(fontColor, emailAddress.fontColor) &&
                Objects.equals(fontSize, emailAddress.fontSize) &&
                Objects.equals(italic, emailAddress.italic) &&
                Objects.equals(mergeField, emailAddress.mergeField) &&
                Objects.equals(name, emailAddress.name) &&
                Objects.equals(pageNumber, emailAddress.pageNumber) &&
                Objects.equals(recipientId, emailAddress.recipientId) &&
                Objects.equals(status, emailAddress.status) &&
                Objects.equals(tabId, emailAddress.tabId) &&
                Objects.equals(tabLabel, emailAddress.tabLabel) &&
                Objects.equals(tabOrder, emailAddress.tabOrder) &&
                Objects.equals(templateLocked, emailAddress.templateLocked) &&
                Objects.equals(templateRequired, emailAddress.templateRequired) &&
                Objects.equals(underline, emailAddress.underline) &&
                Objects.equals(xPosition, emailAddress.xPosition) &&
                Objects.equals(yPosition, emailAddress.yPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, bold, conditionalParentLabel, conditionalParentValue, customTabId, documentId, errorDetails, font, fontColor, fontSize, italic, mergeField, name, pageNumber, recipientId, status, tabId, tabLabel, tabOrder, templateLocked, templateRequired, underline, xPosition, yPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailAddress {\n");

        sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
        sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
        sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
        sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
        sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
        sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
        sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
        sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
        sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
        sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
        sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
        sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    font: ").append(toIndentedString(font)).append("\n");
        sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
        sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
        sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
        sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
        sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
        sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
        sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
        sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
        sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
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
