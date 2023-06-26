/**
 * Skip Pay API for partners
 * API documentation for Skip Pay partners.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: info@skippay.cz
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 */

package cz.skippay.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import cz.skippay.model.FinancingType;
import cz.skippay.model.MerchantUrls;
import cz.skippay.model.OrderRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cz.skippay.JSON;

/**
 * Financing application request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class ApplicationWithoutCustomerRequest {
  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderRequest order;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FinancingType type;

  public static final String SERIALIZED_NAME_AGREEMENT_TERMS_AND_CONDITIONS = "agreementTermsAndConditions";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_TERMS_AND_CONDITIONS)
  private Boolean agreementTermsAndConditions;

  public static final String SERIALIZED_NAME_PRECHECK_IDS = "precheckIds";
  @SerializedName(SERIALIZED_NAME_PRECHECK_IDS)
  private List<String> precheckIds;

  public static final String SERIALIZED_NAME_MERCHANT_URLS = "merchantUrls";
  @SerializedName(SERIALIZED_NAME_MERCHANT_URLS)
  private MerchantUrls merchantUrls;

  public ApplicationWithoutCustomerRequest() {
  }

  public ApplicationWithoutCustomerRequest order(OrderRequest order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull
  public OrderRequest getOrder() {
    return order;
  }


  public void setOrder(OrderRequest order) {
    this.order = order;
  }


  public ApplicationWithoutCustomerRequest type(FinancingType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public FinancingType getType() {
    return type;
  }


  public void setType(FinancingType type) {
    this.type = type;
  }


  public ApplicationWithoutCustomerRequest agreementTermsAndConditions(Boolean agreementTermsAndConditions) {
    
    this.agreementTermsAndConditions = agreementTermsAndConditions;
    return this;
  }

   /**
   * Terms and conditions agreement
   * @return agreementTermsAndConditions
  **/
  @javax.annotation.Nullable
  public Boolean getAgreementTermsAndConditions() {
    return agreementTermsAndConditions;
  }


  public void setAgreementTermsAndConditions(Boolean agreementTermsAndConditions) {
    this.agreementTermsAndConditions = agreementTermsAndConditions;
  }


  public ApplicationWithoutCustomerRequest precheckIds(List<String> precheckIds) {
    
    this.precheckIds = precheckIds;
    return this;
  }

  public ApplicationWithoutCustomerRequest addPrecheckIdsItem(String precheckIdsItem) {
    if (this.precheckIds == null) {
      this.precheckIds = new ArrayList<>();
    }
    this.precheckIds.add(precheckIdsItem);
    return this;
  }

   /**
   * Array of all precheck ids related to this application. See [Precheck operation](htttps://developers.skippay.cz/docs/api/precheck) and it&#39;s response (PrecheckResultsResponse).
   * @return precheckIds
  **/
  @javax.annotation.Nullable
  public List<String> getPrecheckIds() {
    return precheckIds;
  }


  public void setPrecheckIds(List<String> precheckIds) {
    this.precheckIds = precheckIds;
  }


  public ApplicationWithoutCustomerRequest merchantUrls(MerchantUrls merchantUrls) {
    
    this.merchantUrls = merchantUrls;
    return this;
  }

   /**
   * Get merchantUrls
   * @return merchantUrls
  **/
  @javax.annotation.Nonnull
  public MerchantUrls getMerchantUrls() {
    return merchantUrls;
  }


  public void setMerchantUrls(MerchantUrls merchantUrls) {
    this.merchantUrls = merchantUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationWithoutCustomerRequest applicationWithoutCustomerRequest = (ApplicationWithoutCustomerRequest) o;
    return Objects.equals(this.order, applicationWithoutCustomerRequest.order) &&
        Objects.equals(this.type, applicationWithoutCustomerRequest.type) &&
        Objects.equals(this.agreementTermsAndConditions, applicationWithoutCustomerRequest.agreementTermsAndConditions) &&
        Objects.equals(this.precheckIds, applicationWithoutCustomerRequest.precheckIds) &&
        Objects.equals(this.merchantUrls, applicationWithoutCustomerRequest.merchantUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, type, agreementTermsAndConditions, precheckIds, merchantUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationWithoutCustomerRequest {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    agreementTermsAndConditions: ").append(toIndentedString(agreementTermsAndConditions)).append("\n");
    sb.append("    precheckIds: ").append(toIndentedString(precheckIds)).append("\n");
    sb.append("    merchantUrls: ").append(toIndentedString(merchantUrls)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("order");
    openapiFields.add("type");
    openapiFields.add("agreementTermsAndConditions");
    openapiFields.add("precheckIds");
    openapiFields.add("merchantUrls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("merchantUrls");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationWithoutCustomerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationWithoutCustomerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationWithoutCustomerRequest is not found in the empty JSON string", ApplicationWithoutCustomerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationWithoutCustomerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationWithoutCustomerRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationWithoutCustomerRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `order`
      OrderRequest.validateJsonObject(jsonObj.getAsJsonObject("order"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("precheckIds") != null && !jsonObj.get("precheckIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `precheckIds` to be an array in the JSON string but got `%s`", jsonObj.get("precheckIds").toString()));
      }
      // validate the required field `merchantUrls`
      MerchantUrls.validateJsonObject(jsonObj.getAsJsonObject("merchantUrls"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationWithoutCustomerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationWithoutCustomerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationWithoutCustomerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationWithoutCustomerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationWithoutCustomerRequest>() {
           @Override
           public void write(JsonWriter out, ApplicationWithoutCustomerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationWithoutCustomerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationWithoutCustomerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationWithoutCustomerRequest
  * @throws IOException if the JSON string is invalid with respect to ApplicationWithoutCustomerRequest
  */
  public static ApplicationWithoutCustomerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationWithoutCustomerRequest.class);
  }

 /**
  * Convert an instance of ApplicationWithoutCustomerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

