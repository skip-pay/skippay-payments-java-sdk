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
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Collection of URLs used for redirection of a customer back to a partner website or as a notification endpoint. Services that should be developed and exposed by partner e-shops to allow Skip Pay to asynchronously inform these partners about important changes regarding particular applications and orders.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class MerchantUrls {
  public static final String SERIALIZED_NAME_APPROVED_REDIRECT = "approvedRedirect";
  @SerializedName(SERIALIZED_NAME_APPROVED_REDIRECT)
  private String approvedRedirect;

  public static final String SERIALIZED_NAME_REJECTED_REDIRECT = "rejectedRedirect";
  @SerializedName(SERIALIZED_NAME_REJECTED_REDIRECT)
  private String rejectedRedirect;

  public static final String SERIALIZED_NAME_NOTIFICATION_ENDPOINT = "notificationEndpoint";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ENDPOINT)
  private String notificationEndpoint;

  public static final String SERIALIZED_NAME_PAYMENTS_ENDPOINT = "paymentsEndpoint";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_ENDPOINT)
  private String paymentsEndpoint;

  public MerchantUrls() {
  }

  public MerchantUrls approvedRedirect(String approvedRedirect) {
    
    this.approvedRedirect = approvedRedirect;
    return this;
  }

   /**
   * URL of the partner used for redirection of the customer back to partner website (from Skip Pay gateway) after application approval. Do not implement any business logic on accessing this URL by customer. Implement business logic to READY notification via &#x60;notificationEndpoint&#x60;.
   * @return approvedRedirect
  **/
  @javax.annotation.Nonnull
  public String getApprovedRedirect() {
    return approvedRedirect;
  }


  public void setApprovedRedirect(String approvedRedirect) {
    this.approvedRedirect = approvedRedirect;
  }


  public MerchantUrls rejectedRedirect(String rejectedRedirect) {
    
    this.rejectedRedirect = rejectedRedirect;
    return this;
  }

   /**
   * URL of the partner used for redirection of the customer back to partner website (from Skip Pay gateway) after application rejection.  Do not implement any business logic on accessing this URL by customer. Implement business logic to REJECTED notification via &#x60;notificationEndpoint&#x60;.
   * @return rejectedRedirect
  **/
  @javax.annotation.Nonnull
  public String getRejectedRedirect() {
    return rejectedRedirect;
  }


  public void setRejectedRedirect(String rejectedRedirect) {
    this.rejectedRedirect = rejectedRedirect;
  }


  public MerchantUrls notificationEndpoint(String notificationEndpoint) {
    
    this.notificationEndpoint = notificationEndpoint;
    return this;
  }

   /**
   * URL of the partner used as a notification endpoint for obtaining important updates about application (approval, rejection, storno, etc.).
   * @return notificationEndpoint
  **/
  @javax.annotation.Nonnull
  public String getNotificationEndpoint() {
    return notificationEndpoint;
  }


  public void setNotificationEndpoint(String notificationEndpoint) {
    this.notificationEndpoint = notificationEndpoint;
  }


  public MerchantUrls paymentsEndpoint(String paymentsEndpoint) {
    
    this.paymentsEndpoint = paymentsEndpoint;
    return this;
  }

   /**
   * URL of the partner used as a notification endpoint for obtaining information about payments connected with application.
   * @return paymentsEndpoint
  **/
  @javax.annotation.Nullable
  public String getPaymentsEndpoint() {
    return paymentsEndpoint;
  }


  public void setPaymentsEndpoint(String paymentsEndpoint) {
    this.paymentsEndpoint = paymentsEndpoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantUrls merchantUrls = (MerchantUrls) o;
    return Objects.equals(this.approvedRedirect, merchantUrls.approvedRedirect) &&
        Objects.equals(this.rejectedRedirect, merchantUrls.rejectedRedirect) &&
        Objects.equals(this.notificationEndpoint, merchantUrls.notificationEndpoint) &&
        Objects.equals(this.paymentsEndpoint, merchantUrls.paymentsEndpoint);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedRedirect, rejectedRedirect, notificationEndpoint, paymentsEndpoint);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantUrls {\n");
    sb.append("    approvedRedirect: ").append(toIndentedString(approvedRedirect)).append("\n");
    sb.append("    rejectedRedirect: ").append(toIndentedString(rejectedRedirect)).append("\n");
    sb.append("    notificationEndpoint: ").append(toIndentedString(notificationEndpoint)).append("\n");
    sb.append("    paymentsEndpoint: ").append(toIndentedString(paymentsEndpoint)).append("\n");
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
    openapiFields.add("approvedRedirect");
    openapiFields.add("rejectedRedirect");
    openapiFields.add("notificationEndpoint");
    openapiFields.add("paymentsEndpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("approvedRedirect");
    openapiRequiredFields.add("rejectedRedirect");
    openapiRequiredFields.add("notificationEndpoint");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantUrls
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantUrls.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantUrls is not found in the empty JSON string", MerchantUrls.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantUrls.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantUrls` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MerchantUrls.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("approvedRedirect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvedRedirect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approvedRedirect").toString()));
      }
      if (!jsonObj.get("rejectedRedirect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectedRedirect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rejectedRedirect").toString()));
      }
      if (!jsonObj.get("notificationEndpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationEndpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationEndpoint").toString()));
      }
      if ((jsonObj.get("paymentsEndpoint") != null && !jsonObj.get("paymentsEndpoint").isJsonNull()) && !jsonObj.get("paymentsEndpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentsEndpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentsEndpoint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantUrls.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantUrls' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantUrls> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantUrls.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantUrls>() {
           @Override
           public void write(JsonWriter out, MerchantUrls value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantUrls read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantUrls given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantUrls
  * @throws IOException if the JSON string is invalid with respect to MerchantUrls
  */
  public static MerchantUrls fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantUrls.class);
  }

 /**
  * Convert an instance of MerchantUrls to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

