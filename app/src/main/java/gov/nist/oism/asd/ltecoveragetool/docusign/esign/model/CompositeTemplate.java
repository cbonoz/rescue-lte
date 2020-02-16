package gov.nist.oism.asd.ltecoveragetool.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CompositeTemplate implements Serializable {

    @SerializedName("compositeTemplateId")
    private String compositeTemplateId = null;

    @SerializedName("document")
    private Document document = null;

    @SerializedName("inlineTemplates")
    private java.util.List<InlineTemplate> inlineTemplates = new java.util.ArrayList<InlineTemplate>();

    @SerializedName("pdfMetaDataTemplateSequence")
    private String pdfMetaDataTemplateSequence = null;

    @SerializedName("serverTemplates")
    private java.util.List<ServerTemplate> serverTemplates = new java.util.ArrayList<ServerTemplate>();


    /**
     * The identify of this composite template. It is used as a reference when adding document object information. If used, the document\u2019s `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.
     **/
    @ApiModelProperty(value = "The identify of this composite template. It is used as a reference when adding document object information. If used, the document\u2019s `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.")
    public String getCompositeTemplateId() {
        return compositeTemplateId;
    }

    public void setCompositeTemplateId(String compositeTemplateId) {
        this.compositeTemplateId = compositeTemplateId;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


    /**
     * Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.
     **/
    @ApiModelProperty(value = " Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.")
    public java.util.List<InlineTemplate> getInlineTemplates() {
        return inlineTemplates;
    }

    public void setInlineTemplates(java.util.List<InlineTemplate> inlineTemplates) {
        this.inlineTemplates = inlineTemplates;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPdfMetaDataTemplateSequence() {
        return pdfMetaDataTemplateSequence;
    }

    public void setPdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
        this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
    }


    /**
     * 0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value
     **/
    @ApiModelProperty(value = "0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value")
    public java.util.List<ServerTemplate> getServerTemplates() {
        return serverTemplates;
    }

    public void setServerTemplates(java.util.List<ServerTemplate> serverTemplates) {
        this.serverTemplates = serverTemplates;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompositeTemplate compositeTemplate = (CompositeTemplate) o;
        return Objects.equals(compositeTemplateId, compositeTemplate.compositeTemplateId) &&
                Objects.equals(document, compositeTemplate.document) &&
                Objects.equals(inlineTemplates, compositeTemplate.inlineTemplates) &&
                Objects.equals(pdfMetaDataTemplateSequence, compositeTemplate.pdfMetaDataTemplateSequence) &&
                Objects.equals(serverTemplates, compositeTemplate.serverTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compositeTemplateId, document, inlineTemplates, pdfMetaDataTemplateSequence, serverTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompositeTemplate {\n");

        sb.append("    compositeTemplateId: ").append(toIndentedString(compositeTemplateId)).append("\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    inlineTemplates: ").append(toIndentedString(inlineTemplates)).append("\n");
        sb.append("    pdfMetaDataTemplateSequence: ").append(toIndentedString(pdfMetaDataTemplateSequence)).append("\n");
        sb.append("    serverTemplates: ").append(toIndentedString(serverTemplates)).append("\n");
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
