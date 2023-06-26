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
import cz.skippay.model.Amount;
import cz.skippay.model.ItemType;
import cz.skippay.model.VatAmount;
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
 * Order item base information, needed to identify order item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class OrderItemBase {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EAN = "ean";
  @SerializedName(SERIALIZED_NAME_EAN)
  private String ean;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ItemType type;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRODUCER = "producer";
  @SerializedName(SERIALIZED_NAME_PRODUCER)
  private String producer;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private Amount totalPrice;

  public static final String SERIALIZED_NAME_TOTAL_VAT = "totalVat";
  @SerializedName(SERIALIZED_NAME_TOTAL_VAT)
  private VatAmount totalVat;

  public static final String SERIALIZED_NAME_PRODUCT_URL = "productUrl";
  @SerializedName(SERIALIZED_NAME_PRODUCT_URL)
  private String productUrl;

  public OrderItemBase() {
  }

  public OrderItemBase code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Internal code for item (internal to e-shop). Used to better identify the item for future changes
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public OrderItemBase ean(String ean) {
    
    this.ean = ean;
    return this;
  }

   /**
   * EAN code.
   * @return ean
  **/
  @javax.annotation.Nullable
  public String getEan() {
    return ean;
  }


  public void setEan(String ean) {
    this.ean = ean;
  }


  public OrderItemBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Item name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrderItemBase type(ItemType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public ItemType getType() {
    return type;
  }


  public void setType(ItemType type) {
    this.type = type;
  }


  public OrderItemBase variant(String variant) {
    
    this.variant = variant;
    return this;
  }

   /**
   * Item variant
   * @return variant
  **/
  @javax.annotation.Nullable
  public String getVariant() {
    return variant;
  }


  public void setVariant(String variant) {
    this.variant = variant;
  }


  public OrderItemBase description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public OrderItemBase producer(String producer) {
    
    this.producer = producer;
    return this;
  }

   /**
   * Producer name
   * @return producer
  **/
  @javax.annotation.Nullable
  public String getProducer() {
    return producer;
  }


  public void setProducer(String producer) {
    this.producer = producer;
  }


  public OrderItemBase categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public OrderItemBase addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * List of item categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<String> getCategories() {
    return categories;
  }


  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public OrderItemBase totalPrice(Amount totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @javax.annotation.Nonnull
  public Amount getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }


  public OrderItemBase totalVat(VatAmount totalVat) {
    
    this.totalVat = totalVat;
    return this;
  }

   /**
   * Get totalVat
   * @return totalVat
  **/
  @javax.annotation.Nonnull
  public VatAmount getTotalVat() {
    return totalVat;
  }


  public void setTotalVat(VatAmount totalVat) {
    this.totalVat = totalVat;
  }


  public OrderItemBase productUrl(String productUrl) {
    
    this.productUrl = productUrl;
    return this;
  }

   /**
   * URL of the item in e-shop
   * @return productUrl
  **/
  @javax.annotation.Nullable
  public String getProductUrl() {
    return productUrl;
  }


  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemBase orderItemBase = (OrderItemBase) o;
    return Objects.equals(this.code, orderItemBase.code) &&
        Objects.equals(this.ean, orderItemBase.ean) &&
        Objects.equals(this.name, orderItemBase.name) &&
        Objects.equals(this.type, orderItemBase.type) &&
        Objects.equals(this.variant, orderItemBase.variant) &&
        Objects.equals(this.description, orderItemBase.description) &&
        Objects.equals(this.producer, orderItemBase.producer) &&
        Objects.equals(this.categories, orderItemBase.categories) &&
        Objects.equals(this.totalPrice, orderItemBase.totalPrice) &&
        Objects.equals(this.totalVat, orderItemBase.totalVat) &&
        Objects.equals(this.productUrl, orderItemBase.productUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, ean, name, type, variant, description, producer, categories, totalPrice, totalVat, productUrl);
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
    sb.append("class OrderItemBase {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalVat: ").append(toIndentedString(totalVat)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("ean");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("variant");
    openapiFields.add("description");
    openapiFields.add("producer");
    openapiFields.add("categories");
    openapiFields.add("totalPrice");
    openapiFields.add("totalVat");
    openapiFields.add("productUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("totalPrice");
    openapiRequiredFields.add("totalVat");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderItemBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemBase is not found in the empty JSON string", OrderItemBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderItemBase.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("ean") != null && !jsonObj.get("ean").isJsonNull()) && !jsonObj.get("ean").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ean` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ean").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("variant") != null && !jsonObj.get("variant").isJsonNull()) && !jsonObj.get("variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("producer") != null && !jsonObj.get("producer").isJsonNull()) && !jsonObj.get("producer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      // validate the required field `totalPrice`
      Amount.validateJsonObject(jsonObj.getAsJsonObject("totalPrice"));
      // validate the required field `totalVat`
      VatAmount.validateJsonObject(jsonObj.getAsJsonObject("totalVat"));
      if ((jsonObj.get("productUrl") != null && !jsonObj.get("productUrl").isJsonNull()) && !jsonObj.get("productUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemBase.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemBase>() {
           @Override
           public void write(JsonWriter out, OrderItemBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemBase
  * @throws IOException if the JSON string is invalid with respect to OrderItemBase
  */
  public static OrderItemBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemBase.class);
  }

 /**
  * Convert an instance of OrderItemBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

