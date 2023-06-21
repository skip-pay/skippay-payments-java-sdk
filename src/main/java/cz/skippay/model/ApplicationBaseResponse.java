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
 * Financing application base information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class ApplicationBaseResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Application state.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PROCESSING("PROCESSING"),
    
    READY("READY"),
    
    REJECTED("REJECTED"),
    
    CANCELLED("CANCELLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  /**
   * Describes internal state of application, e.g. when state is PROCESSING - reason why application remains in processing state
   */
  @JsonAdapter(StateReasonEnum.Adapter.class)
  public enum StateReasonEnum {
    PROCESSING_REDIRECT_NEEDED("PROCESSING_REDIRECT_NEEDED"),
    
    PROCESSING_PREAPPROVED("PROCESSING_PREAPPROVED"),
    
    PROCESSING_VALIDATION_IN_PROGRESS("PROCESSING_VALIDATION_IN_PROGRESS"),
    
    REJECTED("REJECTED"),
    
    CANCELLED_NOT_PAID("CANCELLED_NOT_PAID"),
    
    READY_TO_SHIP("READY_TO_SHIP"),
    
    READY_SHIPPED("READY_SHIPPED"),
    
    READY_DELIVERED("READY_DELIVERED"),
    
    READY_PAID("READY_PAID"),
    
    CANCELLED_RETURNED("CANCELLED_RETURNED");

    private String value;

    StateReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateReasonEnum fromValue(String value) {
      for (StateReasonEnum b : StateReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE_REASON = "stateReason";
  @SerializedName(SERIALIZED_NAME_STATE_REASON)
  private StateReasonEnum stateReason;

  public ApplicationBaseResponse() {
  }

  public ApplicationBaseResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier in Skip Pay
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ApplicationBaseResponse state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Application state.
   * @return state
  **/
  @javax.annotation.Nonnull
  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public ApplicationBaseResponse stateReason(StateReasonEnum stateReason) {
    
    this.stateReason = stateReason;
    return this;
  }

   /**
   * Describes internal state of application, e.g. when state is PROCESSING - reason why application remains in processing state
   * @return stateReason
  **/
  @javax.annotation.Nonnull
  public StateReasonEnum getStateReason() {
    return stateReason;
  }


  public void setStateReason(StateReasonEnum stateReason) {
    this.stateReason = stateReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationBaseResponse applicationBaseResponse = (ApplicationBaseResponse) o;
    return Objects.equals(this.id, applicationBaseResponse.id) &&
        Objects.equals(this.state, applicationBaseResponse.state) &&
        Objects.equals(this.stateReason, applicationBaseResponse.stateReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, stateReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationBaseResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("state");
    openapiFields.add("stateReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("stateReason");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationBaseResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationBaseResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationBaseResponse is not found in the empty JSON string", ApplicationBaseResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationBaseResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationBaseResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationBaseResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("stateReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationBaseResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationBaseResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationBaseResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationBaseResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationBaseResponse>() {
           @Override
           public void write(JsonWriter out, ApplicationBaseResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationBaseResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationBaseResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationBaseResponse
  * @throws IOException if the JSON string is invalid with respect to ApplicationBaseResponse
  */
  public static ApplicationBaseResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationBaseResponse.class);
  }

 /**
  * Convert an instance of ApplicationBaseResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

