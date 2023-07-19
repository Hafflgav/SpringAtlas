/*
 * 5Minds Engine API
 * This is the swagger ui documentation of the 5Minds Engine API.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.miragon.processcube.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Describes a single entry in the list of cronjob histories.
 */
@ApiModel(description = "Describes a single entry in the list of cronjob histories.")
@JsonPropertyOrder({
  CronjobHistoryEntry.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  CronjobHistoryEntry.JSON_PROPERTY_PROCESS_MODEL_ID,
  CronjobHistoryEntry.JSON_PROPERTY_START_EVENT_ID,
  CronjobHistoryEntry.JSON_PROPERTY_CRONTAB,
  CronjobHistoryEntry.JSON_PROPERTY_EXECUTED_AT,
  CronjobHistoryEntry.JSON_PROPERTY_PROCESS_INSTANCE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class CronjobHistoryEntry {
  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private String processDefinitionId;

  public static final String JSON_PROPERTY_PROCESS_MODEL_ID = "processModelId";
  private String processModelId;

  public static final String JSON_PROPERTY_START_EVENT_ID = "startEventId";
  private String startEventId;

  public static final String JSON_PROPERTY_CRONTAB = "crontab";
  private String crontab;

  public static final String JSON_PROPERTY_EXECUTED_AT = "executedAt";
  private String executedAt;

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
  private String processInstanceId;


  public CronjobHistoryEntry processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The ID of the process definition
   * @return processDefinitionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the process definition")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public CronjobHistoryEntry processModelId(String processModelId) {
    
    this.processModelId = processModelId;
    return this;
  }

   /**
   * The ID of the process model
   * @return processModelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the process model")
  @JsonProperty(JSON_PROPERTY_PROCESS_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProcessModelId() {
    return processModelId;
  }


  public void setProcessModelId(String processModelId) {
    this.processModelId = processModelId;
  }


  public CronjobHistoryEntry startEventId(String startEventId) {
    
    this.startEventId = startEventId;
    return this;
  }

   /**
   * The ID of the start event
   * @return startEventId
  **/
  @ApiModelProperty(required = true, value = "The ID of the start event")
  @JsonProperty(JSON_PROPERTY_START_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartEventId() {
    return startEventId;
  }


  public void setStartEventId(String startEventId) {
    this.startEventId = startEventId;
  }


  public CronjobHistoryEntry crontab(String crontab) {
    
    this.crontab = crontab;
    return this;
  }

   /**
   * The crontab that describs the cronjob.
   * @return crontab
  **/
  @ApiModelProperty(required = true, value = "The crontab that describs the cronjob.")
  @JsonProperty(JSON_PROPERTY_CRONTAB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCrontab() {
    return crontab;
  }


  public void setCrontab(String crontab) {
    this.crontab = crontab;
  }


  public CronjobHistoryEntry executedAt(String executedAt) {
    
    this.executedAt = executedAt;
    return this;
  }

   /**
   * The time the cronjob was executed.
   * @return executedAt
  **/
  @ApiModelProperty(required = true, value = "The time the cronjob was executed.")
  @JsonProperty(JSON_PROPERTY_EXECUTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExecutedAt() {
    return executedAt;
  }


  public void setExecutedAt(String executedAt) {
    this.executedAt = executedAt;
  }


  public CronjobHistoryEntry processInstanceId(String processInstanceId) {
    
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * The ID of the process instance that was started by the cronjob.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the process instance that was started by the cronjob.")
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CronjobHistoryEntry cronjobHistoryEntry = (CronjobHistoryEntry) o;
    return Objects.equals(this.processDefinitionId, cronjobHistoryEntry.processDefinitionId) &&
        Objects.equals(this.processModelId, cronjobHistoryEntry.processModelId) &&
        Objects.equals(this.startEventId, cronjobHistoryEntry.startEventId) &&
        Objects.equals(this.crontab, cronjobHistoryEntry.crontab) &&
        Objects.equals(this.executedAt, cronjobHistoryEntry.executedAt) &&
        Objects.equals(this.processInstanceId, cronjobHistoryEntry.processInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, processModelId, startEventId, crontab, executedAt, processInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronjobHistoryEntry {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processModelId: ").append(toIndentedString(processModelId)).append("\n");
    sb.append("    startEventId: ").append(toIndentedString(startEventId)).append("\n");
    sb.append("    crontab: ").append(toIndentedString(crontab)).append("\n");
    sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
