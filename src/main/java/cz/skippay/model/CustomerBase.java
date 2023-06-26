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
import cz.skippay.model.Address;
import cz.skippay.model.CustomerExtraData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Customer data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class CustomerBase {
  public static final String SERIALIZED_NAME_TITLE_BEFORE = "titleBefore";
  @SerializedName(SERIALIZED_NAME_TITLE_BEFORE)
  private String titleBefore;

  public static final String SERIALIZED_NAME_TITLE_AFTER = "titleAfter";
  @SerializedName(SERIALIZED_NAME_TITLE_AFTER)
  private String titleAfter;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Address> addresses;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_VATIN = "vatin";
  @SerializedName(SERIALIZED_NAME_VATIN)
  private String vatin;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "extraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private CustomerExtraData extraData;

  public CustomerBase() {
  }

  public CustomerBase titleBefore(String titleBefore) {
    
    this.titleBefore = titleBefore;
    return this;
  }

   /**
   * Academical degree, in front of the name
   * @return titleBefore
  **/
  @javax.annotation.Nullable
  public String getTitleBefore() {
    return titleBefore;
  }


  public void setTitleBefore(String titleBefore) {
    this.titleBefore = titleBefore;
  }


  public CustomerBase titleAfter(String titleAfter) {
    
    this.titleAfter = titleAfter;
    return this;
  }

   /**
   * Academical degree, behind name
   * @return titleAfter
  **/
  @javax.annotation.Nullable
  public String getTitleAfter() {
    return titleAfter;
  }


  public void setTitleAfter(String titleAfter) {
    this.titleAfter = titleAfter;
  }


  public CustomerBase email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * E-mail address of customer
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerBase addresses(List<Address> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public CustomerBase addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Addresses. All types are allowed.
   * @return addresses
  **/
  @javax.annotation.Nullable
  public List<Address> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  public CustomerBase tin(String tin) {
    
    this.tin = tin;
    return this;
  }

   /**
   * Tax identification number (ICO)
   * @return tin
  **/
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }


  public void setTin(String tin) {
    this.tin = tin;
  }


  public CustomerBase vatin(String vatin) {
    
    this.vatin = vatin;
    return this;
  }

   /**
   * VAT identification number
   * @return vatin
  **/
  @javax.annotation.Nullable
  public String getVatin() {
    return vatin;
  }


  public void setVatin(String vatin) {
    this.vatin = vatin;
  }


  public CustomerBase extraData(CustomerExtraData extraData) {
    
    this.extraData = extraData;
    return this;
  }

   /**
   * Get extraData
   * @return extraData
  **/
  @javax.annotation.Nullable
  public CustomerExtraData getExtraData() {
    return extraData;
  }


  public void setExtraData(CustomerExtraData extraData) {
    this.extraData = extraData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerBase customerBase = (CustomerBase) o;
    return Objects.equals(this.titleBefore, customerBase.titleBefore) &&
        Objects.equals(this.titleAfter, customerBase.titleAfter) &&
        Objects.equals(this.email, customerBase.email) &&
        Objects.equals(this.addresses, customerBase.addresses) &&
        Objects.equals(this.tin, customerBase.tin) &&
        Objects.equals(this.vatin, customerBase.vatin) &&
        Objects.equals(this.extraData, customerBase.extraData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(titleBefore, titleAfter, email, addresses, tin, vatin, extraData);
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
    sb.append("class CustomerBase {\n");
    sb.append("    titleBefore: ").append(toIndentedString(titleBefore)).append("\n");
    sb.append("    titleAfter: ").append(toIndentedString(titleAfter)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    vatin: ").append(toIndentedString(vatin)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
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
    openapiFields.add("titleBefore");
    openapiFields.add("titleAfter");
    openapiFields.add("email");
    openapiFields.add("addresses");
    openapiFields.add("tin");
    openapiFields.add("vatin");
    openapiFields.add("extraData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerBase is not found in the empty JSON string", CustomerBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerBase.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("titleBefore") != null && !jsonObj.get("titleBefore").isJsonNull()) && !jsonObj.get("titleBefore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titleBefore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titleBefore").toString()));
      }
      if ((jsonObj.get("titleAfter") != null && !jsonObj.get("titleAfter").isJsonNull()) && !jsonObj.get("titleAfter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titleAfter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titleAfter").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            Address.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("vatin") != null && !jsonObj.get("vatin").isJsonNull()) && !jsonObj.get("vatin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vatin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vatin").toString()));
      }
      // validate the optional field `extraData`
      if (jsonObj.get("extraData") != null && !jsonObj.get("extraData").isJsonNull()) {
        CustomerExtraData.validateJsonObject(jsonObj.getAsJsonObject("extraData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerBase.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerBase>() {
           @Override
           public void write(JsonWriter out, CustomerBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerBase
  * @throws IOException if the JSON string is invalid with respect to CustomerBase
  */
  public static CustomerBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerBase.class);
  }

 /**
  * Convert an instance of CustomerBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

