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
import cz.skippay.model.DeliveryCarrier;
import cz.skippay.model.DocumentRequest;
import cz.skippay.model.OrderItemsChangeRequestTotalPrice;
import cz.skippay.model.VatAmount;
import java.io.IOException;
import java.time.LocalDate;
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
 * Object used to mark order items as delivered.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class OrderItemsDeliverRequest {
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

  public static final String SERIALIZED_NAME_SPECIFIC_SYMBOL = "specificSymbol";
  @SerializedName(SERIALIZED_NAME_SPECIFIC_SYMBOL)
  private String specificSymbol;

  public static final String SERIALIZED_NAME_SENT_DATE = "sentDate";
  @SerializedName(SERIALIZED_NAME_SENT_DATE)
  private LocalDate sentDate;

  public static final String SERIALIZED_NAME_DELIVERY_CARRIER = "deliveryCarrier";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CARRIER)
  private DeliveryCarrier deliveryCarrier;

  public static final String SERIALIZED_NAME_DELIVERY_TRACKING_NUMBER = "deliveryTrackingNumber";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TRACKING_NUMBER)
  private String deliveryTrackingNumber;

  public static final String SERIALIZED_NAME_DELIVERY_DATE = "deliveryDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE)
  private LocalDate deliveryDate;

  public OrderItemsDeliverRequest() {
  }

  public OrderItemsDeliverRequest items(List<ChangeOrderItemRequestSerializer> items) {
    
    this.items = items;
    return this;
  }

  public OrderItemsDeliverRequest addItemsItem(ChangeOrderItemRequestSerializer itemsItem) {
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


  public OrderItemsDeliverRequest totalPrice(OrderItemsChangeRequestTotalPrice totalPrice) {
    
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


  public OrderItemsDeliverRequest totalVat(List<VatAmount> totalVat) {
    
    this.totalVat = totalVat;
    return this;
  }

  public OrderItemsDeliverRequest addTotalVatItem(VatAmount totalVatItem) {
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


  public OrderItemsDeliverRequest document(DocumentRequest document) {
    
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


  public OrderItemsDeliverRequest variableSymbol(String variableSymbol) {
    
    this.variableSymbol = variableSymbol;
    return this;
  }

   /**
   * Required if was not specified earlier in &#39;&#39;Create application&#39;&#39; or &#39;&#39;Change application order&#39;&#39; operations. Symbol used for making the payment to your account. This string must contain only numbers, maximum length is 10 characters (digits).
   * @return variableSymbol
  **/
  @javax.annotation.Nullable
  public String getVariableSymbol() {
    return variableSymbol;
  }


  public void setVariableSymbol(String variableSymbol) {
    this.variableSymbol = variableSymbol;
  }


  public OrderItemsDeliverRequest specificSymbol(String specificSymbol) {
    
    this.specificSymbol = specificSymbol;
    return this;
  }

   /**
   * Symbol used for making the payment to your account. This string must contain only numbers, maximum length is 10 characters (digits).
   * @return specificSymbol
  **/
  @javax.annotation.Nullable
  public String getSpecificSymbol() {
    return specificSymbol;
  }


  public void setSpecificSymbol(String specificSymbol) {
    this.specificSymbol = specificSymbol;
  }


  public OrderItemsDeliverRequest sentDate(LocalDate sentDate) {
    
    this.sentDate = sentDate;
    return this;
  }

   /**
   * Shipping date
   * @return sentDate
  **/
  @javax.annotation.Nullable
  public LocalDate getSentDate() {
    return sentDate;
  }


  public void setSentDate(LocalDate sentDate) {
    this.sentDate = sentDate;
  }


  public OrderItemsDeliverRequest deliveryCarrier(DeliveryCarrier deliveryCarrier) {
    
    this.deliveryCarrier = deliveryCarrier;
    return this;
  }

   /**
   * Get deliveryCarrier
   * @return deliveryCarrier
  **/
  @javax.annotation.Nullable
  public DeliveryCarrier getDeliveryCarrier() {
    return deliveryCarrier;
  }


  public void setDeliveryCarrier(DeliveryCarrier deliveryCarrier) {
    this.deliveryCarrier = deliveryCarrier;
  }


  public OrderItemsDeliverRequest deliveryTrackingNumber(String deliveryTrackingNumber) {
    
    this.deliveryTrackingNumber = deliveryTrackingNumber;
    return this;
  }

   /**
   * Delivery tracking number
   * @return deliveryTrackingNumber
  **/
  @javax.annotation.Nullable
  public String getDeliveryTrackingNumber() {
    return deliveryTrackingNumber;
  }


  public void setDeliveryTrackingNumber(String deliveryTrackingNumber) {
    this.deliveryTrackingNumber = deliveryTrackingNumber;
  }


  public OrderItemsDeliverRequest deliveryDate(LocalDate deliveryDate) {
    
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Delivery date
   * @return deliveryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }


  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemsDeliverRequest orderItemsDeliverRequest = (OrderItemsDeliverRequest) o;
    return Objects.equals(this.items, orderItemsDeliverRequest.items) &&
        Objects.equals(this.totalPrice, orderItemsDeliverRequest.totalPrice) &&
        Objects.equals(this.totalVat, orderItemsDeliverRequest.totalVat) &&
        Objects.equals(this.document, orderItemsDeliverRequest.document) &&
        Objects.equals(this.variableSymbol, orderItemsDeliverRequest.variableSymbol) &&
        Objects.equals(this.specificSymbol, orderItemsDeliverRequest.specificSymbol) &&
        Objects.equals(this.sentDate, orderItemsDeliverRequest.sentDate) &&
        Objects.equals(this.deliveryCarrier, orderItemsDeliverRequest.deliveryCarrier) &&
        Objects.equals(this.deliveryTrackingNumber, orderItemsDeliverRequest.deliveryTrackingNumber) &&
        Objects.equals(this.deliveryDate, orderItemsDeliverRequest.deliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalPrice, totalVat, document, variableSymbol, specificSymbol, sentDate, deliveryCarrier, deliveryTrackingNumber, deliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsDeliverRequest {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalVat: ").append(toIndentedString(totalVat)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    variableSymbol: ").append(toIndentedString(variableSymbol)).append("\n");
    sb.append("    specificSymbol: ").append(toIndentedString(specificSymbol)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
    sb.append("    deliveryCarrier: ").append(toIndentedString(deliveryCarrier)).append("\n");
    sb.append("    deliveryTrackingNumber: ").append(toIndentedString(deliveryTrackingNumber)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
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
    openapiFields.add("specificSymbol");
    openapiFields.add("sentDate");
    openapiFields.add("deliveryCarrier");
    openapiFields.add("deliveryTrackingNumber");
    openapiFields.add("deliveryDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemsDeliverRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderItemsDeliverRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemsDeliverRequest is not found in the empty JSON string", OrderItemsDeliverRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemsDeliverRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemsDeliverRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("specificSymbol") != null && !jsonObj.get("specificSymbol").isJsonNull()) && !jsonObj.get("specificSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specificSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specificSymbol").toString()));
      }
      // validate the optional field `deliveryCarrier`
      if (jsonObj.get("deliveryCarrier") != null && !jsonObj.get("deliveryCarrier").isJsonNull()) {
        DeliveryCarrier.validateJsonObject(jsonObj.getAsJsonObject("deliveryCarrier"));
      }
      if ((jsonObj.get("deliveryTrackingNumber") != null && !jsonObj.get("deliveryTrackingNumber").isJsonNull()) && !jsonObj.get("deliveryTrackingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryTrackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryTrackingNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemsDeliverRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemsDeliverRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemsDeliverRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemsDeliverRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemsDeliverRequest>() {
           @Override
           public void write(JsonWriter out, OrderItemsDeliverRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemsDeliverRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemsDeliverRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemsDeliverRequest
  * @throws IOException if the JSON string is invalid with respect to OrderItemsDeliverRequest
  */
  public static OrderItemsDeliverRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemsDeliverRequest.class);
  }

 /**
  * Convert an instance of OrderItemsDeliverRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

