// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GMIOAJDAFAB.proto

package emu.grasscutter.net.proto;

public final class GMIOAJDAFABOuterClass {
  private GMIOAJDAFABOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GMIOAJDAFAB}
   */
  public enum GMIOAJDAFAB
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonNone = 0;</code>
     */
    GMIOAJDAFAB_EnterUgcDungeonNone(0),
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonTrialInEditDungeon = 1;</code>
     */
    GMIOAJDAFAB_EnterUgcDungeonTrialInEditDungeon(1),
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonTrialInWorld = 2;</code>
     */
    GMIOAJDAFAB_EnterUgcDungeonTrialInWorld(2),
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonPlay = 3;</code>
     */
    GMIOAJDAFAB_EnterUgcDungeonPlay(3),
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonOfficial = 4;</code>
     */
    GMIOAJDAFAB_EnterUgcDungeonOfficial(4),
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonByGm = 5;</code>
     */
    GMIOAJDAFAB_EnterUgcDungeonByGm(5),
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonByEdit = 6;</code>
     */
    GMIOAJDAFAB_EnterUgcDungeonByEdit(6),
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonTrialOneRoom = 7;</code>
     */
    GMIOAJDAFAB_EnterUgcDungeonTrialOneRoom(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonNone = 0;</code>
     */
    public static final int GMIOAJDAFAB_EnterUgcDungeonNone_VALUE = 0;
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonTrialInEditDungeon = 1;</code>
     */
    public static final int GMIOAJDAFAB_EnterUgcDungeonTrialInEditDungeon_VALUE = 1;
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonTrialInWorld = 2;</code>
     */
    public static final int GMIOAJDAFAB_EnterUgcDungeonTrialInWorld_VALUE = 2;
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonPlay = 3;</code>
     */
    public static final int GMIOAJDAFAB_EnterUgcDungeonPlay_VALUE = 3;
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonOfficial = 4;</code>
     */
    public static final int GMIOAJDAFAB_EnterUgcDungeonOfficial_VALUE = 4;
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonByGm = 5;</code>
     */
    public static final int GMIOAJDAFAB_EnterUgcDungeonByGm_VALUE = 5;
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonByEdit = 6;</code>
     */
    public static final int GMIOAJDAFAB_EnterUgcDungeonByEdit_VALUE = 6;
    /**
     * <code>GMIOAJDAFAB_EnterUgcDungeonTrialOneRoom = 7;</code>
     */
    public static final int GMIOAJDAFAB_EnterUgcDungeonTrialOneRoom_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GMIOAJDAFAB valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GMIOAJDAFAB forNumber(int value) {
      switch (value) {
        case 0: return GMIOAJDAFAB_EnterUgcDungeonNone;
        case 1: return GMIOAJDAFAB_EnterUgcDungeonTrialInEditDungeon;
        case 2: return GMIOAJDAFAB_EnterUgcDungeonTrialInWorld;
        case 3: return GMIOAJDAFAB_EnterUgcDungeonPlay;
        case 4: return GMIOAJDAFAB_EnterUgcDungeonOfficial;
        case 5: return GMIOAJDAFAB_EnterUgcDungeonByGm;
        case 6: return GMIOAJDAFAB_EnterUgcDungeonByEdit;
        case 7: return GMIOAJDAFAB_EnterUgcDungeonTrialOneRoom;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GMIOAJDAFAB>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GMIOAJDAFAB> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GMIOAJDAFAB>() {
            public GMIOAJDAFAB findValueByNumber(int number) {
              return GMIOAJDAFAB.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GMIOAJDAFAB[] VALUES = values();

    public static GMIOAJDAFAB valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GMIOAJDAFAB(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GMIOAJDAFAB)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GMIOAJDAFAB.proto*\331\002\n\013GMIOAJDAFAB\022#\n\037G" +
      "MIOAJDAFAB_EnterUgcDungeonNone\020\000\0221\n-GMIO" +
      "AJDAFAB_EnterUgcDungeonTrialInEditDungeo" +
      "n\020\001\022+\n\'GMIOAJDAFAB_EnterUgcDungeonTrialI" +
      "nWorld\020\002\022#\n\037GMIOAJDAFAB_EnterUgcDungeonP" +
      "lay\020\003\022\'\n#GMIOAJDAFAB_EnterUgcDungeonOffi" +
      "cial\020\004\022#\n\037GMIOAJDAFAB_EnterUgcDungeonByG" +
      "m\020\005\022%\n!GMIOAJDAFAB_EnterUgcDungeonByEdit" +
      "\020\006\022+\n\'GMIOAJDAFAB_EnterUgcDungeonTrialOn" +
      "eRoom\020\007B\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
