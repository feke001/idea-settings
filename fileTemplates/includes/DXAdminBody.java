  private static Log log = LogFactory.getLog("com.bmg.dxc.dxadmin.uploadaccount.${NAME}");

  /* Member fields */
  //protected Integer accessUploadAccountId = null;
  protected Integer  = null;

  /* Table field names*/
  //public static final String FIELD_UPLOAD_ACCOUNT_ID = "access_upl_acc_id";
  public static final String FIELD_ = "";

  public static final String TABLE_ALIAS = DXCTableAlias.;

  /* Reference entity fields */
  //Owner user groups from AccessUploadAccountInfo
  //protected static final int REF_USER_GROUP_ACCOUNT_INFO_INDEX = 0;

  //Reference table alias, reference entity map, reference entity map to delete, action type by deletion, reference entity class, keyField name
  protected static final Object[][] REFERENCE_DATA = {
    {DXCTableAlias.ACCESS_UPLOAD_ACCOUNT_INFO, null, null, DELETE_ACTION_TYPE_ABORT, AccessUploadAccountInfo.class},
    };

  // default constructor
  public ${NAME}()
  {
    super(TABLE_ALIAS, REFERENCE_DATA);
  }

  // construct with PK
  public ${NAME}(Integer pk)
  {
    this();
    this.pk = pk;
  }

  // construct with data
  public ${NAME}(Map data)
  {
    this();
    loadData(data);
  }

  public Map getDataMap()
  {
    Map fieldToValue = new HashMap();
    //fieldToValue.put(FIELD_UPLOAD_ACCOUNT_ID, this.accessUploadAccountId);
    fieldToValue.put(FIELD_, this.);
    return fieldToValue;
  }

  protected void loadData(Map data)
  {
    //setAccessUploadAccountId((Integer) data.get(FIELD_UPLOAD_ACCOUNT_ID));
    set((Integer) data.get(FIELD_));
  }

  // getters and setters
  
  // TODO : get/set here
  public Integer getAccessUploadAccountId()
  {
    return accessUploadAccountId;
  }

  //PK must not be null
  protected void setAccessUploadAccountId(Integer accessUploadAccountId)
  {
    if (accessUploadAccountId == null) {
      log.error("Try to initialize AccessUploadAccount with null PK. accessUploadAccountId:" + accessUploadAccountId);
      throw new SetValueException("Primary key cannot be set to null.");
    }
    this.accessUploadAccountId = accessUploadAccountId;
    setModified(true);
  }

  ///////////////////////////////////REFERENCES//////////////////////////////////////////////////////////

  public List getUserGroupIds()
      throws StorageException
  {
    return getReferenceObjectKeys(REF_USER_GROUP_ACCOUNT_INFO_INDEX);
  }

  public boolean hasAssetOwner()
      throws StorageException
  {
    return hasReference(REF_ASSET);
  }

  ///////////////////////////////////END OF DB REFERENCES//////////////////////////////////////////////////////////

  public boolean getHasInsertActionRight()
  {
    return false;
  }

  public boolean getHasUpdateActionRight()
  {
    return false;
  }

  public boolean getHasDeleteActionRight()
  {
    return false;
  }

  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }

    final ${NAME} that = (${NAME}) o;
    if (!entityId.equals(that.entityId))
    {
      return false;
    }

    return true;
  }

