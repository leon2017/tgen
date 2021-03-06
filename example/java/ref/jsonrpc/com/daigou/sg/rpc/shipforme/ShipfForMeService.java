package com.daigou.sg.rpc.shipforme;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.daigou.sg.rpc.BaseModule;
import com.daigou.sg.rpc.GsonUtils;
import com.daigou.sg.rpc.RpcRequest;
import com.daigou.sg.rpc.TRpc;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
public class ShipfForMeService {
    private static final Gson gson = GsonUtils.getGsonInstance();
    private static int msgID = 1;

    private ShipfForMeService() {
        // Constructor hidden because this is a singleton
    }

    private static String getMsgID() {
        msgID += 1;
        return Integer.toString(msgID);
    }

    public static RpcRequest GetCourierCompaniesByRegion(final String originCode, final Listener<ArrayList<String>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<String> result;
                        result = BaseModule.fromJSONArray(response, String.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(originCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.GetCourierCompaniesByRegion");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserAddNewShipForMeOrder(final String warehouseCode, final String shipperName, final String wayBill, final String alternative, final boolean takePhoto, final String originCode, final String repack, final Listener<Integer> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        Integer result;
                        result = BaseModule.fromJSON(response, Integer.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(warehouseCode);
                params.add(shipperName);
                params.add(wayBill);
                params.add(alternative);
                params.add(takePhoto);
                params.add(originCode);
                params.add(repack);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserAddNewShipForMeOrder");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserConfirmShipForMeRepack(final boolean confirm, final int orderId, final Listener<Void> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {if (listener != null) {
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(confirm);
                params.add(orderId);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserConfirmShipForMeRepack");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserDeleteShipForMeOrder(final int orderId, final Listener<Void> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {if (listener != null) {
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(orderId);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserDeleteShipForMeOrder");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetShipForMeAddressByRegion(final String originCode, final Listener<ArrayList<TShipformeAddress>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TShipformeAddress> result;
                        result = BaseModule.fromJSONArray(response, TShipformeAddress.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(originCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserGetShipForMeAddressByRegion");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetShipForMeHomeSummary(final Listener<TShipForMeOrderHomeSummary> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        TShipForMeOrderHomeSummary result;
                        result = BaseModule.fromJSON(response, TShipForMeOrderHomeSummary.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserGetShipForMeHomeSummary");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetShipForMeOrderDetailByOrderId(final int orderId, final Listener<TShipForMeOrder> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        TShipForMeOrder result;
                        result = BaseModule.fromJSON(response, TShipForMeOrder.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(orderId);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserGetShipForMeOrderDetailByOrderId");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetShipForMeOrderFeeByOrderIds(final ArrayList<String> orderIds, final boolean insured, final String deliveryMethod, final String shipmentTypeCode, final int customerAddressId, final String originCode, final String warehouseCode, final String couponCode, final Listener<TShipformeOrderBill> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        TShipformeOrderBill result;
                        result = BaseModule.fromJSON(response, TShipformeOrderBill.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(orderIds);
                params.add(insured);
                params.add(deliveryMethod);
                params.add(shipmentTypeCode);
                params.add(customerAddressId);
                params.add(originCode);
                params.add(warehouseCode);
                params.add(couponCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserGetShipForMeOrderFeeByOrderIds");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetShipForMeOrderListByStatus(final String originCode, final String warehouseCode, final String status, final int offset, final int limit, final Listener<ArrayList<TShipForMeOrder>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TShipForMeOrder> result;
                        result = BaseModule.fromJSONArray(response, TShipForMeOrder.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(originCode);
                params.add(warehouseCode);
                params.add(status);
                params.add(offset);
                params.add(limit);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserGetShipForMeOrderListByStatus");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetShipForMeSummary(final String originCode, final Listener<TShipForMeOrderSummary> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        TShipForMeOrderSummary result;
                        result = BaseModule.fromJSON(response, TShipForMeOrderSummary.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(originCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserGetShipForMeSummary");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserPackShipForMeOrder(final ArrayList<String> orderIds, final boolean insured, final String deliveryMethod, final String shipmentTypeCode, final int customerAddressId, final String originCode, final String warehouseCode, final String couponCode, final Listener<Integer> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        Integer result;
                        result = BaseModule.fromJSON(response, Integer.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(orderIds);
                params.add(insured);
                params.add(deliveryMethod);
                params.add(shipmentTypeCode);
                params.add(customerAddressId);
                params.add(originCode);
                params.add(warehouseCode);
                params.add(couponCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserPackShipForMeOrder");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSaveShipForMeOrderPrice(final String orderIds, final double price, final Listener<Void> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {if (listener != null) {
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(orderIds);
                params.add(price);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserSaveShipForMeOrderPrice");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSendToTelephone(final String phoneNumber, final Listener<Boolean> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        Boolean result;
                        result = BaseModule.fromJSON(response, Boolean.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(phoneNumber);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserSendToTelephone");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserUpdateShipForMeOrder(final int orderId, final String warehouseCode, final String shipperName, final String wayBill, final String alternative, final boolean takePhoto, final String repack, final Listener<Void> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {if (listener != null) {
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(orderId);
                params.add(warehouseCode);
                params.add(shipperName);
                params.add(wayBill);
                params.add(alternative);
                params.add(takePhoto);
                params.add(repack);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserUpdateShipForMeOrder");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserValidationPhone(final String phoneNumber, final String validationCode, final Listener<Boolean> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(),
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        Boolean result;
                        result = BaseModule.fromJSON(response, Boolean.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                         
                        // Log.d("ex", ex.toString());
                        // Log.d("jsonObject", response);
                         
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(phoneNumber);
                params.add(validationCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "ShipfForMe.UserValidationPhone");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        TRpc.getQueue().add(req);
        return req;
    }
}
