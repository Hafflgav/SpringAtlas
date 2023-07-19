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
import io.miragon.processcube.client.model.BpmnType;
import io.miragon.processcube.client.model.EventType;
import io.miragon.processcube.client.model.ExternalTaskCreatedMessage;
import io.miragon.processcube.client.model.ExternalTaskErrorMessageAllOf;
import io.miragon.processcube.client.model.ExternalTaskReusableError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Message that is sent whenever an ExternalTask encountered an error.
 */
@ApiModel(description = "Message that is sent whenever an ExternalTask encountered an error.")
@JsonPropertyOrder({
  ExternalTaskErrorMessage.JSON_PROPERTY_CORRELATION_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_PROCESS_MODEL_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_PROCESS_MODEL_NAME,
  ExternalTaskErrorMessage.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_PARENT_PROCESS_INSTANCE_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_FLOW_NODE_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_FLOW_NODE_NAME,
  ExternalTaskErrorMessage.JSON_PROPERTY_FLOW_NODE_TYPE,
  ExternalTaskErrorMessage.JSON_PROPERTY_FLOW_NODE_INSTANCE_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_OWNER_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_PREVIOUS_FLOW_NODE_INSTANCE_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_CURRENT_TOKEN,
  ExternalTaskErrorMessage.JSON_PROPERTY_EVENT_TYPE,
  ExternalTaskErrorMessage.JSON_PROPERTY_EVENT_NAME,
  ExternalTaskErrorMessage.JSON_PROPERTY_CUSTOM_CORRELATION_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_EXTERNAL_TASK_ID,
  ExternalTaskErrorMessage.JSON_PROPERTY_TOPIC,
  ExternalTaskErrorMessage.JSON_PROPERTY_IS_SINGLE_TRY,
  ExternalTaskErrorMessage.JSON_PROPERTY_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class ExternalTaskErrorMessage {
  public static final String JSON_PROPERTY_CORRELATION_ID = "correlationId";
  private String correlationId;

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private String processDefinitionId;

  public static final String JSON_PROPERTY_PROCESS_MODEL_ID = "processModelId";
  private String processModelId;

  public static final String JSON_PROPERTY_PROCESS_MODEL_NAME = "processModelName";
  private String processModelName;

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
  private String processInstanceId;

  public static final String JSON_PROPERTY_PARENT_PROCESS_INSTANCE_ID = "parentProcessInstanceId";
  private String parentProcessInstanceId;

  public static final String JSON_PROPERTY_FLOW_NODE_ID = "flowNodeId";
  private String flowNodeId;

  public static final String JSON_PROPERTY_FLOW_NODE_NAME = "flowNodeName";
  private String flowNodeName;

  public static final String JSON_PROPERTY_FLOW_NODE_TYPE = "flowNodeType";
  private BpmnType flowNodeType;

  public static final String JSON_PROPERTY_FLOW_NODE_INSTANCE_ID = "flowNodeInstanceId";
  private String flowNodeInstanceId;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  private String ownerId;

  public static final String JSON_PROPERTY_PREVIOUS_FLOW_NODE_INSTANCE_ID = "previousFlowNodeInstanceId";
  private String previousFlowNodeInstanceId;

  public static final String JSON_PROPERTY_CURRENT_TOKEN = "currentToken";
  private Object currentToken;

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private EventType eventType;

  public static final String JSON_PROPERTY_EVENT_NAME = "eventName";
  private String eventName;

  public static final String JSON_PROPERTY_CUSTOM_CORRELATION_ID = "customCorrelationId";
  private String customCorrelationId;

  public static final String JSON_PROPERTY_EXTERNAL_TASK_ID = "externalTaskId";
  private String externalTaskId;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public static final String JSON_PROPERTY_IS_SINGLE_TRY = "isSingleTry";
  private Boolean isSingleTry;

  public static final String JSON_PROPERTY_ERROR = "error";
  private ExternalTaskReusableError error;


  public ExternalTaskErrorMessage correlationId(String correlationId) {
    
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The ID of the correlation that the event belongs to.
   * @return correlationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the correlation that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCorrelationId() {
    return correlationId;
  }


  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  public ExternalTaskErrorMessage processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The ID of the ProcessDefinition that the event belongs to.
   * @return processDefinitionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the ProcessDefinition that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public ExternalTaskErrorMessage processModelId(String processModelId) {
    
    this.processModelId = processModelId;
    return this;
  }

   /**
   * The ID of the ProcessModel that the event belongs to.
   * @return processModelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the ProcessModel that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_PROCESS_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProcessModelId() {
    return processModelId;
  }


  public void setProcessModelId(String processModelId) {
    this.processModelId = processModelId;
  }


  public ExternalTaskErrorMessage processModelName(String processModelName) {
    
    this.processModelName = processModelName;
    return this;
  }

   /**
   * The name of the ProcessModel that the event belongs to.
   * @return processModelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the ProcessModel that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_PROCESS_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessModelName() {
    return processModelName;
  }


  public void setProcessModelName(String processModelName) {
    this.processModelName = processModelName;
  }


  public ExternalTaskErrorMessage processInstanceId(String processInstanceId) {
    
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * The ID of the ProcessInstance that the event belongs to.
   * @return processInstanceId
  **/
  @ApiModelProperty(required = true, value = "The ID of the ProcessInstance that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public ExternalTaskErrorMessage parentProcessInstanceId(String parentProcessInstanceId) {
    
    this.parentProcessInstanceId = parentProcessInstanceId;
    return this;
  }

   /**
   * The ID of the parent ProcessInstance (if event occured in a sub process)
   * @return parentProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the parent ProcessInstance (if event occured in a sub process)")
  @JsonProperty(JSON_PROPERTY_PARENT_PROCESS_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentProcessInstanceId() {
    return parentProcessInstanceId;
  }


  public void setParentProcessInstanceId(String parentProcessInstanceId) {
    this.parentProcessInstanceId = parentProcessInstanceId;
  }


  public ExternalTaskErrorMessage flowNodeId(String flowNodeId) {
    
    this.flowNodeId = flowNodeId;
    return this;
  }

   /**
   * The ID of the FlowNode that the event belongs to.
   * @return flowNodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the FlowNode that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_FLOW_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlowNodeId() {
    return flowNodeId;
  }


  public void setFlowNodeId(String flowNodeId) {
    this.flowNodeId = flowNodeId;
  }


  public ExternalTaskErrorMessage flowNodeName(String flowNodeName) {
    
    this.flowNodeName = flowNodeName;
    return this;
  }

   /**
   * The name of the FlowNode that the event belongs to.
   * @return flowNodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the FlowNode that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_FLOW_NODE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlowNodeName() {
    return flowNodeName;
  }


  public void setFlowNodeName(String flowNodeName) {
    this.flowNodeName = flowNodeName;
  }


  public ExternalTaskErrorMessage flowNodeType(BpmnType flowNodeType) {
    
    this.flowNodeType = flowNodeType;
    return this;
  }

   /**
   * Get flowNodeType
   * @return flowNodeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FLOW_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BpmnType getFlowNodeType() {
    return flowNodeType;
  }


  public void setFlowNodeType(BpmnType flowNodeType) {
    this.flowNodeType = flowNodeType;
  }


  public ExternalTaskErrorMessage flowNodeInstanceId(String flowNodeInstanceId) {
    
    this.flowNodeInstanceId = flowNodeInstanceId;
    return this;
  }

   /**
   * The ID of the FlowNodeInstance that the event belongs to.
   * @return flowNodeInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the FlowNodeInstance that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_FLOW_NODE_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlowNodeInstanceId() {
    return flowNodeInstanceId;
  }


  public void setFlowNodeInstanceId(String flowNodeInstanceId) {
    this.flowNodeInstanceId = flowNodeInstanceId;
  }


  public ExternalTaskErrorMessage ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the user that owns the ProcessInstance that the event belongs to.
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "The ID of the user that owns the ProcessInstance that the event belongs to.")
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public ExternalTaskErrorMessage previousFlowNodeInstanceId(String previousFlowNodeInstanceId) {
    
    this.previousFlowNodeInstanceId = previousFlowNodeInstanceId;
    return this;
  }

   /**
   * The ID of the FlowNodeInstance that was executed before.
   * @return previousFlowNodeInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the FlowNodeInstance that was executed before.")
  @JsonProperty(JSON_PROPERTY_PREVIOUS_FLOW_NODE_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviousFlowNodeInstanceId() {
    return previousFlowNodeInstanceId;
  }


  public void setPreviousFlowNodeInstanceId(String previousFlowNodeInstanceId) {
    this.previousFlowNodeInstanceId = previousFlowNodeInstanceId;
  }


  public ExternalTaskErrorMessage currentToken(Object currentToken) {
    
    this.currentToken = currentToken;
    return this;
  }

   /**
   * The current token of the ProcessInstance.
   * @return currentToken
  **/
  @ApiModelProperty(required = true, value = "The current token of the ProcessInstance.")
  @JsonProperty(JSON_PROPERTY_CURRENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCurrentToken() {
    return currentToken;
  }


  public void setCurrentToken(Object currentToken) {
    this.currentToken = currentToken;
  }


  public ExternalTaskErrorMessage eventType(EventType eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventType getEventType() {
    return eventType;
  }


  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }


  public ExternalTaskErrorMessage eventName(String eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * The name of the event.
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the event.")
  @JsonProperty(JSON_PROPERTY_EVENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventName() {
    return eventName;
  }


  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public ExternalTaskErrorMessage customCorrelationId(String customCorrelationId) {
    
    this.customCorrelationId = customCorrelationId;
    return this;
  }

   /**
   * Process Instances triggered by this Message will use the following Correlation ID.
   * @return customCorrelationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Process Instances triggered by this Message will use the following Correlation ID.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomCorrelationId() {
    return customCorrelationId;
  }


  public void setCustomCorrelationId(String customCorrelationId) {
    this.customCorrelationId = customCorrelationId;
  }


  public ExternalTaskErrorMessage externalTaskId(String externalTaskId) {
    
    this.externalTaskId = externalTaskId;
    return this;
  }

   /**
   * The ID of the ExternalTask.
   * @return externalTaskId
  **/
  @ApiModelProperty(required = true, value = "The ID of the ExternalTask.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalTaskId() {
    return externalTaskId;
  }


  public void setExternalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
  }


  public ExternalTaskErrorMessage topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * The topic of the ExternalTask.
   * @return topic
  **/
  @ApiModelProperty(required = true, value = "The topic of the ExternalTask.")
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public ExternalTaskErrorMessage isSingleTry(Boolean isSingleTry) {
    
    this.isSingleTry = isSingleTry;
    return this;
  }

   /**
   * Flag indicating whether the ExternalTask is a SingleTry ExternalTask.
   * @return isSingleTry
  **/
  @ApiModelProperty(required = true, value = "Flag indicating whether the ExternalTask is a SingleTry ExternalTask.")
  @JsonProperty(JSON_PROPERTY_IS_SINGLE_TRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsSingleTry() {
    return isSingleTry;
  }


  public void setIsSingleTry(Boolean isSingleTry) {
    this.isSingleTry = isSingleTry;
  }


  public ExternalTaskErrorMessage error(ExternalTaskReusableError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ExternalTaskReusableError getError() {
    return error;
  }


  public void setError(ExternalTaskReusableError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTaskErrorMessage externalTaskErrorMessage = (ExternalTaskErrorMessage) o;
    return Objects.equals(this.correlationId, externalTaskErrorMessage.correlationId) &&
        Objects.equals(this.processDefinitionId, externalTaskErrorMessage.processDefinitionId) &&
        Objects.equals(this.processModelId, externalTaskErrorMessage.processModelId) &&
        Objects.equals(this.processModelName, externalTaskErrorMessage.processModelName) &&
        Objects.equals(this.processInstanceId, externalTaskErrorMessage.processInstanceId) &&
        Objects.equals(this.parentProcessInstanceId, externalTaskErrorMessage.parentProcessInstanceId) &&
        Objects.equals(this.flowNodeId, externalTaskErrorMessage.flowNodeId) &&
        Objects.equals(this.flowNodeName, externalTaskErrorMessage.flowNodeName) &&
        Objects.equals(this.flowNodeType, externalTaskErrorMessage.flowNodeType) &&
        Objects.equals(this.flowNodeInstanceId, externalTaskErrorMessage.flowNodeInstanceId) &&
        Objects.equals(this.ownerId, externalTaskErrorMessage.ownerId) &&
        Objects.equals(this.previousFlowNodeInstanceId, externalTaskErrorMessage.previousFlowNodeInstanceId) &&
        Objects.equals(this.currentToken, externalTaskErrorMessage.currentToken) &&
        Objects.equals(this.eventType, externalTaskErrorMessage.eventType) &&
        Objects.equals(this.eventName, externalTaskErrorMessage.eventName) &&
        Objects.equals(this.customCorrelationId, externalTaskErrorMessage.customCorrelationId) &&
        Objects.equals(this.externalTaskId, externalTaskErrorMessage.externalTaskId) &&
        Objects.equals(this.topic, externalTaskErrorMessage.topic) &&
        Objects.equals(this.isSingleTry, externalTaskErrorMessage.isSingleTry) &&
        Objects.equals(this.error, externalTaskErrorMessage.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, processDefinitionId, processModelId, processModelName, processInstanceId, parentProcessInstanceId, flowNodeId, flowNodeName, flowNodeType, flowNodeInstanceId, ownerId, previousFlowNodeInstanceId, currentToken, eventType, eventName, customCorrelationId, externalTaskId, topic, isSingleTry, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskErrorMessage {\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processModelId: ").append(toIndentedString(processModelId)).append("\n");
    sb.append("    processModelName: ").append(toIndentedString(processModelName)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    parentProcessInstanceId: ").append(toIndentedString(parentProcessInstanceId)).append("\n");
    sb.append("    flowNodeId: ").append(toIndentedString(flowNodeId)).append("\n");
    sb.append("    flowNodeName: ").append(toIndentedString(flowNodeName)).append("\n");
    sb.append("    flowNodeType: ").append(toIndentedString(flowNodeType)).append("\n");
    sb.append("    flowNodeInstanceId: ").append(toIndentedString(flowNodeInstanceId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    previousFlowNodeInstanceId: ").append(toIndentedString(previousFlowNodeInstanceId)).append("\n");
    sb.append("    currentToken: ").append(toIndentedString(currentToken)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    customCorrelationId: ").append(toIndentedString(customCorrelationId)).append("\n");
    sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    isSingleTry: ").append(toIndentedString(isSingleTry)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
