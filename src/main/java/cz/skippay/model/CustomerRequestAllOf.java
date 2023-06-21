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
 * CustomerRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class CustomerRequestAllOf {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public CustomerRequestAllOf() {
  }

  public CustomerRequestAllOf firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer first (given) name. Must be paired with &#x60;lastName&#x60;. Required if &#x60;fullName&#x60; is empty.
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CustomerRequestAllOf lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer last (family) name. Must be paired with &#x60;firstName&#x60;. Required if &#x60;fullName&#x60; is empty.
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CustomerRequestAllOf fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Customer full name, including academical degrees and salutation. Required only if &#x60;firstName&#x60; or &#x60;lastName&#x60; are empty.
   * @return fullName
  **/
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public CustomerRequestAllOf phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number with country code (including leading &#x60;+&#x60;). Phone number is by default required if you are not able to send it contact us.
   * @return phone
  **/
  @javax.annotation.Nonnull
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRequestAllOf customerRequestAllOf = (CustomerRequestAllOf) o;
    return Objects.equals(this.firstName, customerRequestAllOf.firstName) &&
        Objects.equals(this.lastName, customerRequestAllOf.lastName) &&
        Objects.equals(this.fullName, customerRequestAllOf.fullName) &&
        Objects.equals(this.phone, customerRequestAllOf.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, fullName, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRequestAllOf {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("fullName");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("phone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerRequestAllOf is not found in the empty JSON string", CustomerRequestAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerRequestAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerRequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerRequestAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("fullName") != null && !jsonObj.get("fullName").isJsonNull()) && !jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerRequestAllOf>() {
           @Override
           public void write(JsonWriter out, CustomerRequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to CustomerRequestAllOf
  */
  public static CustomerRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerRequestAllOf.class);
  }

 /**
  * Convert an instance of CustomerRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

