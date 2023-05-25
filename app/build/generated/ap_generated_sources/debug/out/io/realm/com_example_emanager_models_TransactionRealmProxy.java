package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_emanager_models_TransactionRealmProxy extends com.example.emanager.models.Transaction
    implements RealmObjectProxy, com_example_emanager_models_TransactionRealmProxyInterface {

    static final class TransactionColumnInfo extends ColumnInfo {
        long typeColKey;
        long categoryColKey;
        long accountColKey;
        long noteColKey;
        long dateColKey;
        long amountColKey;
        long idColKey;

        TransactionColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Transaction");
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.categoryColKey = addColumnDetails("category", "category", objectSchemaInfo);
            this.accountColKey = addColumnDetails("account", "account", objectSchemaInfo);
            this.noteColKey = addColumnDetails("note", "note", objectSchemaInfo);
            this.dateColKey = addColumnDetails("date", "date", objectSchemaInfo);
            this.amountColKey = addColumnDetails("amount", "amount", objectSchemaInfo);
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
        }

        TransactionColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TransactionColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TransactionColumnInfo src = (TransactionColumnInfo) rawSrc;
            final TransactionColumnInfo dst = (TransactionColumnInfo) rawDst;
            dst.typeColKey = src.typeColKey;
            dst.categoryColKey = src.categoryColKey;
            dst.accountColKey = src.accountColKey;
            dst.noteColKey = src.noteColKey;
            dst.dateColKey = src.dateColKey;
            dst.amountColKey = src.amountColKey;
            dst.idColKey = src.idColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TransactionColumnInfo columnInfo;
    private ProxyState<com.example.emanager.models.Transaction> proxyState;

    com_example_emanager_models_TransactionRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TransactionColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.emanager.models.Transaction>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeColKey);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.typeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$category() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.categoryColKey);
    }

    @Override
    public void realmSet$category(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.categoryColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.categoryColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.categoryColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.categoryColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$account() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.accountColKey);
    }

    @Override
    public void realmSet$account(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.accountColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.accountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.accountColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.accountColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$note() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.noteColKey);
    }

    @Override
    public void realmSet$note(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.noteColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.noteColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.noteColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.noteColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.dateColKey)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.dateColKey);
    }

    @Override
    public void realmSet$date(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setDate(columnInfo.dateColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateColKey);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.dateColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$amount() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.amountColKey);
    }

    @Override
    public void realmSet$amount(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.amountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.amountColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "Transaction", false, 7, 0);
        builder.addPersistedProperty(NO_ALIAS, "type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "category", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "account", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "note", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "date", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "amount", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TransactionColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TransactionColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Transaction";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Transaction";
    }

    @SuppressWarnings("cast")
    public static com.example.emanager.models.Transaction createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.emanager.models.Transaction obj = null;
        if (update) {
            Table table = realm.getTable(com.example.emanager.models.Transaction.class);
            TransactionColumnInfo columnInfo = (TransactionColumnInfo) realm.getSchema().getColumnInfo(com.example.emanager.models.Transaction.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.example.emanager.models.Transaction.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_emanager_models_TransactionRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_emanager_models_TransactionRealmProxy) realm.createObjectInternal(com.example.emanager.models.Transaction.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_emanager_models_TransactionRealmProxy) realm.createObjectInternal(com.example.emanager.models.Transaction.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_emanager_models_TransactionRealmProxyInterface objProxy = (com_example_emanager_models_TransactionRealmProxyInterface) obj;
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("category")) {
            if (json.isNull("category")) {
                objProxy.realmSet$category(null);
            } else {
                objProxy.realmSet$category((String) json.getString("category"));
            }
        }
        if (json.has("account")) {
            if (json.isNull("account")) {
                objProxy.realmSet$account(null);
            } else {
                objProxy.realmSet$account((String) json.getString("account"));
            }
        }
        if (json.has("note")) {
            if (json.isNull("note")) {
                objProxy.realmSet$note(null);
            } else {
                objProxy.realmSet$note((String) json.getString("note"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                objProxy.realmSet$date(null);
            } else {
                Object timestamp = json.get("date");
                if (timestamp instanceof String) {
                    objProxy.realmSet$date(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$date(new Date(json.getLong("date")));
                }
            }
        }
        if (json.has("amount")) {
            if (json.isNull("amount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'amount' to null.");
            } else {
                objProxy.realmSet$amount((double) json.getDouble("amount"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.emanager.models.Transaction createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.emanager.models.Transaction obj = new com.example.emanager.models.Transaction();
        final com_example_emanager_models_TransactionRealmProxyInterface objProxy = (com_example_emanager_models_TransactionRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("category")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$category((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$category(null);
                }
            } else if (name.equals("account")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$account((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$account(null);
                }
            } else if (name.equals("note")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$note((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$note(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$date(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$date(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$date(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("amount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$amount((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'amount' to null.");
                }
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_example_emanager_models_TransactionRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.emanager.models.Transaction.class), false, Collections.<String>emptyList());
        io.realm.com_example_emanager_models_TransactionRealmProxy obj = new io.realm.com_example_emanager_models_TransactionRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.emanager.models.Transaction copyOrUpdate(Realm realm, TransactionColumnInfo columnInfo, com.example.emanager.models.Transaction object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.emanager.models.Transaction) cachedRealmObject;
        }

        com.example.emanager.models.Transaction realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.emanager.models.Transaction.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_emanager_models_TransactionRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.emanager.models.Transaction copy(Realm realm, TransactionColumnInfo columnInfo, com.example.emanager.models.Transaction newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.emanager.models.Transaction) cachedRealmObject;
        }

        com_example_emanager_models_TransactionRealmProxyInterface unmanagedSource = (com_example_emanager_models_TransactionRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.emanager.models.Transaction.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.typeColKey, unmanagedSource.realmGet$type());
        builder.addString(columnInfo.categoryColKey, unmanagedSource.realmGet$category());
        builder.addString(columnInfo.accountColKey, unmanagedSource.realmGet$account());
        builder.addString(columnInfo.noteColKey, unmanagedSource.realmGet$note());
        builder.addDate(columnInfo.dateColKey, unmanagedSource.realmGet$date());
        builder.addDouble(columnInfo.amountColKey, unmanagedSource.realmGet$amount());
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_emanager_models_TransactionRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.emanager.models.Transaction object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.emanager.models.Transaction.class);
        long tableNativePtr = table.getNativePtr();
        TransactionColumnInfo columnInfo = (TransactionColumnInfo) realm.getSchema().getColumnInfo(com.example.emanager.models.Transaction.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$type = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
        }
        String realmGet$category = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.categoryColKey, objKey, realmGet$category, false);
        }
        String realmGet$account = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$account();
        if (realmGet$account != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accountColKey, objKey, realmGet$account, false);
        }
        String realmGet$note = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$note();
        if (realmGet$note != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noteColKey, objKey, realmGet$note, false);
        }
        java.util.Date realmGet$date = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date.getTime(), false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.amountColKey, objKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$amount(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.emanager.models.Transaction.class);
        long tableNativePtr = table.getNativePtr();
        TransactionColumnInfo columnInfo = (TransactionColumnInfo) realm.getSchema().getColumnInfo(com.example.emanager.models.Transaction.class);
        long pkColumnKey = columnInfo.idColKey;
        com.example.emanager.models.Transaction object = null;
        while (objects.hasNext()) {
            object = (com.example.emanager.models.Transaction) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$type = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
            }
            String realmGet$category = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$category();
            if (realmGet$category != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.categoryColKey, objKey, realmGet$category, false);
            }
            String realmGet$account = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$account();
            if (realmGet$account != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.accountColKey, objKey, realmGet$account, false);
            }
            String realmGet$note = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$note();
            if (realmGet$note != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noteColKey, objKey, realmGet$note, false);
            }
            java.util.Date realmGet$date = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date.getTime(), false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.amountColKey, objKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$amount(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.emanager.models.Transaction object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.emanager.models.Transaction.class);
        long tableNativePtr = table.getNativePtr();
        TransactionColumnInfo columnInfo = (TransactionColumnInfo) realm.getSchema().getColumnInfo(com.example.emanager.models.Transaction.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        String realmGet$type = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, objKey, false);
        }
        String realmGet$category = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.categoryColKey, objKey, realmGet$category, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.categoryColKey, objKey, false);
        }
        String realmGet$account = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$account();
        if (realmGet$account != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accountColKey, objKey, realmGet$account, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.accountColKey, objKey, false);
        }
        String realmGet$note = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$note();
        if (realmGet$note != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noteColKey, objKey, realmGet$note, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.noteColKey, objKey, false);
        }
        java.util.Date realmGet$date = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateColKey, objKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.amountColKey, objKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$amount(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.emanager.models.Transaction.class);
        long tableNativePtr = table.getNativePtr();
        TransactionColumnInfo columnInfo = (TransactionColumnInfo) realm.getSchema().getColumnInfo(com.example.emanager.models.Transaction.class);
        long pkColumnKey = columnInfo.idColKey;
        com.example.emanager.models.Transaction object = null;
        while (objects.hasNext()) {
            object = (com.example.emanager.models.Transaction) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            String realmGet$type = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, objKey, false);
            }
            String realmGet$category = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$category();
            if (realmGet$category != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.categoryColKey, objKey, realmGet$category, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.categoryColKey, objKey, false);
            }
            String realmGet$account = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$account();
            if (realmGet$account != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.accountColKey, objKey, realmGet$account, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.accountColKey, objKey, false);
            }
            String realmGet$note = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$note();
            if (realmGet$note != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noteColKey, objKey, realmGet$note, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.noteColKey, objKey, false);
            }
            java.util.Date realmGet$date = ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateColKey, objKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.amountColKey, objKey, ((com_example_emanager_models_TransactionRealmProxyInterface) object).realmGet$amount(), false);
        }
    }

    public static com.example.emanager.models.Transaction createDetachedCopy(com.example.emanager.models.Transaction realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.emanager.models.Transaction unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.emanager.models.Transaction();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.emanager.models.Transaction) cachedObject.object;
            }
            unmanagedObject = (com.example.emanager.models.Transaction) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_emanager_models_TransactionRealmProxyInterface unmanagedCopy = (com_example_emanager_models_TransactionRealmProxyInterface) unmanagedObject;
        com_example_emanager_models_TransactionRealmProxyInterface realmSource = (com_example_emanager_models_TransactionRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$category(realmSource.realmGet$category());
        unmanagedCopy.realmSet$account(realmSource.realmGet$account());
        unmanagedCopy.realmSet$note(realmSource.realmGet$note());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$amount(realmSource.realmGet$amount());
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());

        return unmanagedObject;
    }

    static com.example.emanager.models.Transaction update(Realm realm, TransactionColumnInfo columnInfo, com.example.emanager.models.Transaction realmObject, com.example.emanager.models.Transaction newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_emanager_models_TransactionRealmProxyInterface realmObjectTarget = (com_example_emanager_models_TransactionRealmProxyInterface) realmObject;
        com_example_emanager_models_TransactionRealmProxyInterface realmObjectSource = (com_example_emanager_models_TransactionRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.emanager.models.Transaction.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.typeColKey, realmObjectSource.realmGet$type());
        builder.addString(columnInfo.categoryColKey, realmObjectSource.realmGet$category());
        builder.addString(columnInfo.accountColKey, realmObjectSource.realmGet$account());
        builder.addString(columnInfo.noteColKey, realmObjectSource.realmGet$note());
        builder.addDate(columnInfo.dateColKey, realmObjectSource.realmGet$date());
        builder.addDouble(columnInfo.amountColKey, realmObjectSource.realmGet$amount());
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Transaction = proxy[");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{category:");
        stringBuilder.append(realmGet$category() != null ? realmGet$category() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{account:");
        stringBuilder.append(realmGet$account() != null ? realmGet$account() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{note:");
        stringBuilder.append(realmGet$note() != null ? realmGet$note() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date() != null ? realmGet$date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{amount:");
        stringBuilder.append(realmGet$amount());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_emanager_models_TransactionRealmProxy aTransaction = (com_example_emanager_models_TransactionRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aTransaction.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTransaction.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aTransaction.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
