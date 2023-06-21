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
import cz.skippay.model.CustomerResponse;
import cz.skippay.model.FinancingType;
import cz.skippay.model.OrderResponse;
import cz.skippay.model.RecurrenceObject;
import java.io.IOException;

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
 * ApplicationResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class ApplicationResponseAllOf {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerResponse customer;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderResponse order;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FinancingType type;

  public static final String SERIALIZED_NAME_AGREEMENT_TERMS_AND_CONDITIONS = "agreementTermsAndConditions";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_TERMS_AND_CONDITIONS)
  private Boolean agreementTermsAndConditions;

  public static final String SERIALIZED_NAME_GATEWAY_REDIRECT_URL = "gatewayRedirectUrl";
  @SerializedName(SERIALIZED_NAME_GATEWAY_REDIRECT_URL)
  private String gatewayRedirectUrl;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private RecurrenceObject recurrence;

  public ApplicationResponseAllOf() {
  }

  public ApplicationResponseAllOf customer(CustomerResponse customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public CustomerResponse getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerResponse customer) {
    this.customer = customer;
  }


  public ApplicationResponseAllOf order(OrderResponse order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull
  public OrderResponse getOrder() {
    return order;
  }


  public void setOrder(OrderResponse order) {
    this.order = order;
  }


  public ApplicationResponseAllOf type(FinancingType type) {
    
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


  public ApplicationResponseAllOf agreementTermsAndConditions(Boolean agreementTermsAndConditions) {
    
    this.agreementTermsAndConditions = agreementTermsAndConditions;
    return this;
  }

   /**
   * Terms and conditions agreement
   * @return agreementTermsAndConditions
  **/
  @javax.annotation.Nonnull
  public Boolean getAgreementTermsAndConditions() {
    return agreementTermsAndConditions;
  }


  public void setAgreementTermsAndConditions(Boolean agreementTermsAndConditions) {
    this.agreementTermsAndConditions = agreementTermsAndConditions;
  }


  public ApplicationResponseAllOf gatewayRedirectUrl(String gatewayRedirectUrl) {
    
    this.gatewayRedirectUrl = gatewayRedirectUrl;
    return this;
  }

   /**
   * Gateway redirect URL. Redirect user to this URL if state is &#x60;PROCESSING&#x60; and stateReason is &#x60;PROCESSING_REDIRECT_NEEDED&#x60;.
   * @return gatewayRedirectUrl
  **/
  @javax.annotation.Nonnull
  public String getGatewayRedirectUrl() {
    return gatewayRedirectUrl;
  }


  public void setGatewayRedirectUrl(String gatewayRedirectUrl) {
    this.gatewayRedirectUrl = gatewayRedirectUrl;
  }


  public ApplicationResponseAllOf recurrence(RecurrenceObject recurrence) {
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  public RecurrenceObject getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(RecurrenceObject recurrence) {
    this.recurrence = recurrence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationResponseAllOf applicationResponseAllOf = (ApplicationResponseAllOf) o;
    return Objects.equals(this.customer, applicationResponseAllOf.customer) &&
        Objects.equals(this.order, applicationResponseAllOf.order) &&
        Objects.equals(this.type, applicationResponseAllOf.type) &&
        Objects.equals(this.agreementTermsAndConditions, applicationResponseAllOf.agreementTermsAndConditions) &&
        Objects.equals(this.gatewayRedirectUrl, applicationResponseAllOf.gatewayRedirectUrl) &&
        Objects.equals(this.recurrence, applicationResponseAllOf.recurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, order, type, agreementTermsAndConditions, gatewayRedirectUrl, recurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationResponseAllOf {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    agreementTermsAndConditions: ").append(toIndentedString(agreementTermsAndConditions)).append("\n");
    sb.append("    gatewayRedirectUrl: ").append(toIndentedString(gatewayRedirectUrl)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("order");
    openapiFields.add("type");
    openapiFields.add("agreementTermsAndConditions");
    openapiFields.add("gatewayRedirectUrl");
    openapiFields.add("recurrence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("order");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("agreementTermsAndConditions");
    openapiRequiredFields.add("gatewayRedirectUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationResponseAllOf is not found in the empty JSON string", ApplicationResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `customer`
      CustomerResponse.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      // validate the required field `order`
      OrderResponse.validateJsonObject(jsonObj.getAsJsonObject("order"));
      if (!jsonObj.get("gatewayRedirectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayRedirectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayRedirectUrl").toString()));
      }
      // validate the optional field `recurrence`
      if (jsonObj.get("recurrence") != null && !jsonObj.get("recurrence").isJsonNull()) {
        RecurrenceObject.validateJsonObject(jsonObj.getAsJsonObject("recurrence"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ApplicationResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ApplicationResponseAllOf
  */
  public static ApplicationResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationResponseAllOf.class);
  }

 /**
  * Convert an instance of ApplicationResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

