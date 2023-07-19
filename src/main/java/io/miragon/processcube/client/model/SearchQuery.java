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

import java.lang.reflect.Array;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The query to use for a search.
 */
@ApiModel(description = "The query to use for a search.")
@JsonPropertyOrder({
  SearchQuery.JSON_PROPERTY_OPERATOR,
  SearchQuery.JSON_PROPERTY_SEARCH_PARAMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class SearchQuery {
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_SEARCH_PARAMS = "searchParams";
  private Array[] searchParams = null;


  public SearchQuery operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * The operator to use for the search (or / and).
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "The operator to use for the search (or / and).")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public SearchQuery searchParams(Array[] searchParams) {
    
    this.searchParams = searchParams;
    return this;
  }

   /**
   * The search parameters to use for the search.
   * @return searchParams
  **/
  @ApiModelProperty(required = true, value = "The search parameters to use for the search.")
  @JsonProperty(JSON_PROPERTY_SEARCH_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Array[] getSearchParams() {
    return searchParams;
  }


  public void setSearchParams(Array[] searchParams) {
    this.searchParams = searchParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchQuery searchQuery = (SearchQuery) o;
    return Objects.equals(this.operator, searchQuery.operator) &&
        Objects.equals(this.searchParams, searchQuery.searchParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, searchParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchQuery {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
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
