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
 * Specification of the reason why the application is cancelled.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class ApplicationCancelRequest {
  /**
   * Reason of cancellation. Considered as &#x60;APPLICATION_CANCELLED_OTHER&#x60; if not set.
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    CARRIER_CHANGED("APPLICATION_CANCELLED_CARRIER_CHANGED"),
    
    CART_CONTENT_CHANGED("APPLICATION_CANCELLED_CART_CONTENT_CHANGED"),
    
    BY_CUSTOMER("APPLICATION_CANCELLED_BY_CUSTOMER"),
    
    BY_ERP("APPLICATION_CANCELLED_BY_ERP"),
    
    EXPIRED("APPLICATION_CANCELLED_EXPIRED"),
    
    UNFINISHED("APPLICATION_CANCELLED_UNFINISHED"),
    
    BY_ESHOP_RULES("APPLICATION_CANCELLED_BY_ESHOP_RULES"),
    
    OTHER("APPLICATION_CANCELLED_OTHER");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public static final String SERIALIZED_NAME_CUSTOM_REASON = "customReason";
  @SerializedName(SERIALIZED_NAME_CUSTOM_REASON)
  private String customReason;

  public ApplicationCancelRequest() {
  }

  public ApplicationCancelRequest reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason of cancellation. Considered as &#x60;APPLICATION_CANCELLED_OTHER&#x60; if not set.
   * @return reason
  **/
  @javax.annotation.Nullable
  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public ApplicationCancelRequest customReason(String customReason) {
    
    this.customReason = customReason;
    return this;
  }

   /**
   * Specification of &#x60;APPLICATION_CANCELLED_OTHER&#x60; reason
   * @return customReason
  **/
  @javax.annotation.Nullable
  public String getCustomReason() {
    return customReason;
  }


  public void setCustomReason(String customReason) {
    this.customReason = customReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationCancelRequest applicationCancelRequest = (ApplicationCancelRequest) o;
    return Objects.equals(this.reason, applicationCancelRequest.reason) &&
        Objects.equals(this.customReason, applicationCancelRequest.customReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, customReason);
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
    sb.append("class ApplicationCancelRequest {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    customReason: ").append(toIndentedString(customReason)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("customReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationCancelRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationCancelRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationCancelRequest is not found in the empty JSON string", ApplicationCancelRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationCancelRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationCancelRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("customReason") != null && !jsonObj.get("customReason").isJsonNull()) && !jsonObj.get("customReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationCancelRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationCancelRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationCancelRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationCancelRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationCancelRequest>() {
           @Override
           public void write(JsonWriter out, ApplicationCancelRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationCancelRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationCancelRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationCancelRequest
  * @throws IOException if the JSON string is invalid with respect to ApplicationCancelRequest
  */
  public static ApplicationCancelRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationCancelRequest.class);
  }

 /**
  * Convert an instance of ApplicationCancelRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

