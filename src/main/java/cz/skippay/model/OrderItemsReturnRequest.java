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
import cz.skippay.model.ChangeOrderItemRequestSerializer;
import cz.skippay.model.DocumentRequest;
import cz.skippay.model.OrderItemsChangeRequestTotalPrice;
import cz.skippay.model.VatAmount;
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
 * Object used to mark order items as returned.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class OrderItemsReturnRequest {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ChangeOrderItemRequestSerializer> items;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private OrderItemsChangeRequestTotalPrice totalPrice;

  public static final String SERIALIZED_NAME_TOTAL_VAT = "totalVat";
  @SerializedName(SERIALIZED_NAME_TOTAL_VAT)
  private List<VatAmount> totalVat;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private DocumentRequest document;

  public static final String SERIALIZED_NAME_VARIABLE_SYMBOL = "variableSymbol";
  @SerializedName(SERIALIZED_NAME_VARIABLE_SYMBOL)
  private String variableSymbol;

  public OrderItemsReturnRequest() {
  }

  public OrderItemsReturnRequest items(List<ChangeOrderItemRequestSerializer> items) {
    
    this.items = items;
    return this;
  }

  public OrderItemsReturnRequest addItemsItem(ChangeOrderItemRequestSerializer itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of changed items. All items are considered when empty.
   * @return items
  **/
  @javax.annotation.Nullable
  public List<ChangeOrderItemRequestSerializer> getItems() {
    return items;
  }


  public void setItems(List<ChangeOrderItemRequestSerializer> items) {
    this.items = items;
  }


  public OrderItemsReturnRequest totalPrice(OrderItemsChangeRequestTotalPrice totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  public OrderItemsChangeRequestTotalPrice getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(OrderItemsChangeRequestTotalPrice totalPrice) {
    this.totalPrice = totalPrice;
  }


  public OrderItemsReturnRequest totalVat(List<VatAmount> totalVat) {
    
    this.totalVat = totalVat;
    return this;
  }

  public OrderItemsReturnRequest addTotalVatItem(VatAmount totalVatItem) {
    if (this.totalVat == null) {
      this.totalVat = new ArrayList<>();
    }
    this.totalVat.add(totalVatItem);
    return this;
  }

   /**
   * Total VAT amounts of items (from orderItems array) split by their VAT rates.
   * @return totalVat
  **/
  @javax.annotation.Nullable
  public List<VatAmount> getTotalVat() {
    return totalVat;
  }


  public void setTotalVat(List<VatAmount> totalVat) {
    this.totalVat = totalVat;
  }


  public OrderItemsReturnRequest document(DocumentRequest document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  public DocumentRequest getDocument() {
    return document;
  }


  public void setDocument(DocumentRequest document) {
    this.document = document;
  }


  public OrderItemsReturnRequest variableSymbol(String variableSymbol) {
    
    this.variableSymbol = variableSymbol;
    return this;
  }

   /**
   * Variable symbol of the new document (credit note, ...). This symbols is used by Skip Pay to pair payment from e-shop.
   * @return variableSymbol
  **/
  @javax.annotation.Nullable
  public String getVariableSymbol() {
    return variableSymbol;
  }


  public void setVariableSymbol(String variableSymbol) {
    this.variableSymbol = variableSymbol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemsReturnRequest orderItemsReturnRequest = (OrderItemsReturnRequest) o;
    return Objects.equals(this.items, orderItemsReturnRequest.items) &&
        Objects.equals(this.totalPrice, orderItemsReturnRequest.totalPrice) &&
        Objects.equals(this.totalVat, orderItemsReturnRequest.totalVat) &&
        Objects.equals(this.document, orderItemsReturnRequest.document) &&
        Objects.equals(this.variableSymbol, orderItemsReturnRequest.variableSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalPrice, totalVat, document, variableSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsReturnRequest {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalVat: ").append(toIndentedString(totalVat)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    variableSymbol: ").append(toIndentedString(variableSymbol)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("totalPrice");
    openapiFields.add("totalVat");
    openapiFields.add("document");
    openapiFields.add("variableSymbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemsReturnRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderItemsReturnRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemsReturnRequest is not found in the empty JSON string", OrderItemsReturnRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemsReturnRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemsReturnRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            ChangeOrderItemRequestSerializer.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `totalPrice`
      if (jsonObj.get("totalPrice") != null && !jsonObj.get("totalPrice").isJsonNull()) {
        OrderItemsChangeRequestTotalPrice.validateJsonObject(jsonObj.getAsJsonObject("totalPrice"));
      }
      if (jsonObj.get("totalVat") != null && !jsonObj.get("totalVat").isJsonNull()) {
        JsonArray jsonArraytotalVat = jsonObj.getAsJsonArray("totalVat");
        if (jsonArraytotalVat != null) {
          // ensure the json data is an array
          if (!jsonObj.get("totalVat").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `totalVat` to be an array in the JSON string but got `%s`", jsonObj.get("totalVat").toString()));
          }

          // validate the optional field `totalVat` (array)
          for (int i = 0; i < jsonArraytotalVat.size(); i++) {
            VatAmount.validateJsonObject(jsonArraytotalVat.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `document`
      if (jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) {
        DocumentRequest.validateJsonObject(jsonObj.getAsJsonObject("document"));
      }
      if ((jsonObj.get("variableSymbol") != null && !jsonObj.get("variableSymbol").isJsonNull()) && !jsonObj.get("variableSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variableSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variableSymbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemsReturnRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemsReturnRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemsReturnRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemsReturnRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemsReturnRequest>() {
           @Override
           public void write(JsonWriter out, OrderItemsReturnRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemsReturnRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemsReturnRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemsReturnRequest
  * @throws IOException if the JSON string is invalid with respect to OrderItemsReturnRequest
  */
  public static OrderItemsReturnRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemsReturnRequest.class);
  }

 /**
  * Convert an instance of OrderItemsReturnRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

