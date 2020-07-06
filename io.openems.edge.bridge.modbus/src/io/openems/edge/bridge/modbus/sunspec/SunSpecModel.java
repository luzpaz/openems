package io.openems.edge.bridge.modbus.sunspec;

/**
 * Represents a SunSpec Model
 */
<<<<<<< HEAD
public enum SunSpecModel implements ISunSpecModel {
	S_1(//
			"Common", //
			"All SunSpec compliant devices must include this as the first model", //
			"", //
			66, //
			SunSpecModel.S1.values(), //
			SunSpecModelType.COMMON //
	), //
	S_2(//
			"Basic Aggregator", //
			"Aggregates a collection of models for a given model id", //
			"", //
			14, //
			SunSpecModel.S2.values(), //
			SunSpecModelType.AGGREGATOR //
	), //
	S_15(//
			"Interface Counters Model", //
			"Interface counters", //
			"", //
			24, //
			SunSpecModel.S15.values(), //
			SunSpecModelType.NETWORK_CONFIGURATION //
	), //
	S_18(//
			"Cellular Link", //
			"Include this model to support a cellular interface link", //
			"", //
			22, //
			SunSpecModel.S18.values(), //
			SunSpecModelType.NETWORK_CONFIGURATION //
	), //
	S_101(//
			"Inverter (Single Phase)", //
			"Include this model for single phase inverter monitoring", //
			"", //
			50, //
			SunSpecModel.S101.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_102(//
			"Inverter (Split-Phase)", //
			"Include this model for split phase inverter monitoring", //
			"", //
			50, //
			SunSpecModel.S102.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_103(//
			"Inverter (Three Phase)", //
			"Include this model for three phase inverter monitoring", //
			"", //
			50, //
			SunSpecModel.S103.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_111(//
			"Inverter (Single Phase) FLOAT", //
			"Include this model for single phase inverter monitoring using float values", //
			"", //
			60, //
			SunSpecModel.S111.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_112(//
			"Inverter (Split Phase) FLOAT", //
			"Include this model for split phase inverter monitoring using float values", //
			"", //
			60, //
			SunSpecModel.S112.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_113(//
			"Inverter (Three Phase) FLOAT", //
			"Include this model for three phase inverter monitoring using float values", //
			"", //
			60, //
			SunSpecModel.S113.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_120(//
			"Nameplate", //
			"Inverter Controls Nameplate Ratings", //
			"Ref 3: 8.14.3.2, Ref 4: 17", //
			26, //
			SunSpecModel.S120.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_121(//
			"Basic Settings", //
			"Inverter Controls Basic Settings", //
			"Ref 3: 8.4.2.1, Ref 4: 17", //
			30, //
			SunSpecModel.S121.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_122(//
			"Measurements_Status", //
			"Inverter Controls Extended Measurements and Status", //
			"Ref 3: 8.14.3.2, Ref 4: 17", //
			44, //
			SunSpecModel.S122.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_123(//
			"Immediate Controls", //
			"Immediate Inverter Controls", //
			"Ref 3: 8.7.1.2, 8.7.2.2, 8.7.3.2", //
			24, //
			SunSpecModel.S123.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_124(//
			"Storage", //
			"Basic Storage Controls", //
			"Ref 3: 8.7.4.2", //
			24, //
			SunSpecModel.S124.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_125(//
			"Pricing", //
			"Pricing Signal", //
			"Ref 3: 8.7.5.1; Ref 4: 6", //
			8, //
			SunSpecModel.S125.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_127(//
			"Freq-Watt Param", //
			"Parameterized Frequency-Watt", //
			"Ref 3: 8.9.1.2, 8.9.4.2", //
			10, //
			SunSpecModel.S127.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_128(//
			"Dynamic Reactive Current", //
			"Dynamic Reactive Current", //
			"Ref 3: 8.10.1.2; Ref 4: 12", //
			14, //
			SunSpecModel.S128.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_145(//
			"Extended Settings", //
			"Inverter controls extended settings", //
			"", //
			8, //
			SunSpecModel.S145.values(), //
			SunSpecModelType.INVERTER //
	), //
	S_201(//
			"Meter (Single Phase)single phase (AN or AB) meter", //
			"Include this model for single phase (AN or AB) metering", //
			"", //
			105, //
			SunSpecModel.S201.values(), //
			SunSpecModelType.METER //
	), //
	S_202(//
			"split single phase (ABN) meter", //
			"", //
			"", //
			105, //
			SunSpecModel.S202.values(), //
			SunSpecModelType.METER //
	), //
	S_203(//
			"wye-connect three phase (abcn) meter", //
			"", //
			"", //
			105, //
			SunSpecModel.S203.values(), //
			SunSpecModelType.METER //
	), //
	S_204(//
			"delta-connect three phase (abc) meter", //
			"", //
			"", //
			105, //
			SunSpecModel.S204.values(), //
			SunSpecModelType.METER //
	), //
	S_302(//
			"Irradiance Model", //
			"Include to support various irradiance measurements", //
			"", //
			5, //
			SunSpecModel.S302.values(), //
			SunSpecModelType.ENVIRONMENTAL //
	), //
	S_303(//
			"Back of Module Temperature Model", //
			"Include to support variable number of  back of module temperature measurements", //
			"", //
			2, //
			SunSpecModel.S303.values(), //
			SunSpecModelType.ENVIRONMENTAL //
	), //
	S_304(//
			"Inclinometer Model", //
			"Include to support orienation measurements", //
			"", //
			6, //
			SunSpecModel.S304.values(), //
			SunSpecModelType.ENVIRONMENTAL //
	), //
	S_305(//
			"GPS", //
			"Include to support location measurements", //
			"", //
			36, //
			SunSpecModel.S305.values(), //
			SunSpecModelType.ENVIRONMENTAL //
	), //
	S_306(//
			"Reference Point Model", //
			"Include to support a standard reference point", //
			"", //
			4, //
			SunSpecModel.S306.values(), //
			SunSpecModelType.ENVIRONMENTAL //
	), //
	S_307(//
			"Base Met", //
			"Base Meteorolgical Model", //
			"This model supersedes model 301", //
			11, //
			SunSpecModel.S307.values(), //
			SunSpecModelType.ENVIRONMENTAL //
	), //
	S_308(//
			"Mini Met Model", //
			"Include to support a few basic measurements", //
			"", //
			4, //
			SunSpecModel.S308.values(), //
			SunSpecModelType.ENVIRONMENTAL //
	), //
	S_801(//
			"Energy Storage Base Model (DEPRECATED)", //
			"This model has been deprecated.", //
			"", //
			1, //
			SunSpecModel.S801.values(), //
			SunSpecModelType.STORAGE //
	), //
	S_802(//
			"Battery Base Model", //
			"", //
			"", //
			62, //
			SunSpecModel.S802.values(), //
			SunSpecModelType.STORAGE //
	), //
	S_64001(//
			"Veris Status and Configuration", //
			"", //
			"", //
			71, //
			SunSpecModel.S64001.values(), //
			SunSpecModelType.VENDOR_SPECIFIC //
	), //
	S_64101(//
			"Eltek Inverter Extension", //
			"", //
			"", //
			7, //
			SunSpecModel.S64101.values(), //
			SunSpecModelType.VENDOR_SPECIFIC //
	), //
	S_64110(//
			"OutBack AXS device", //
			"", //
			"", //
			282, //
			SunSpecModel.S64110.values(), //
			SunSpecModelType.VENDOR_SPECIFIC //
	), //
	S_64111(//
			"Basic Charge Controller", //
			"", //
			"", //
			23, //
			SunSpecModel.S64111.values(), //
			SunSpecModelType.VENDOR_SPECIFIC //
	), //
	S_64112(//
			"OutBack FM Charge Controller", //
			"", //
			"", //
			64, //
			SunSpecModel.S64112.values(), //
			SunSpecModelType.VENDOR_SPECIFIC //
	); //

	public static enum S1 implements SunSpecPoint {
		VERSION(new PointImpl(//
				"S1_VERSION", //
				"Version", //
				"Major Version of model", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		MD(new PointImpl(//
				"S1_MD", //
				"Model", //
				"Manufacturer specific value (32 chars)", //
				"", //
				PointType.STRING16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		OPT(new PointImpl(//
				"S1_OPT", //
				"Options", //
				"Manufacturer specific value (16 chars)", //
				"", //
				PointType.STRING8, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VR(new PointImpl(//
				"S1_VR", //
				"Version", //
				"Manufacturer specific value (16 chars)", //
				"", //
				PointType.STRING8, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		SN(new PointImpl(//
				"S1_SN", //
				"Serial Number", //
				"Manufacturer specific value (32 chars)", //
				"", //
				PointType.STRING16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DA(new PointImpl(//
				"S1_DA", //
				"Device Address", //
				"Modbus device address", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PAD(new PointImpl(//
				"S1_PAD", //
				"", //
				"", //
				"", //
				PointType.PAD, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S1(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S2 implements SunSpecPoint {
		AID(new PointImpl(//
				"S2_AID", //
				"AID", //
				"Aggregated model id", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		N(new PointImpl(//
				"S2_N", //
				"N", //
				"Number of aggregated models", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		UN(new PointImpl(//
				"S2_UN", //
				"UN", //
				"Update Number.  Incrementing nunber each time the mappping is changed.  If the number is not changed from thelast reading the direct access to a specific offset will result in reading the same logical model as before.  Otherwise the entire model must be read to refresh the changes", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ST(new PointImpl(//
				"S2_ST", //
				"Status", //
				"Enumerated status code", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S2_St.values())), //
		ST_VND(new PointImpl(//
				"S2_ST_VND", //
				"Vendor Status", //
				"Vendor specific status code", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT(new PointImpl(//
				"S2_EVT", //
				"Event Code", //
				"Bitmask event code", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S2_Evt.values())), //
		EVT_VND(new PointImpl(//
				"S2_EVT_VND", //
				"Vendor Event Code", //
				"Vendor specific event code", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CTL(new PointImpl(//
				"S2_CTL", //
				"Control", //
				"Control register for all aggregated devices", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S2_Ctl.values())), //
		CTL_VND(new PointImpl(//
				"S2_CTL_VND", //
				"Vendor Control", //
				"Vendor control register for all aggregated devices", //
				"", //
				PointType.ENUM32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CTL_VL(new PointImpl(//
				"S2_CTL_VL", //
				"Control Value", //
				"Numerical value used as a parameter to the control", //
				"", //
				PointType.ENUM32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S2(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S2_St implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(1, "OFF"), //
		ON(2, "ON"), //
		FULL(3, "FULL"), //
		FAULT(4, "FAULT"); //

		private final int value;
		private final String name;

		private S2_St(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S2_Evt implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		GROUND_FAULT(0, "GROUND_FAULT"), //
		INPUT_OVER_VOLTAGE(1, "INPUT_OVER_VOLTAGE"), //
		RESERVED_2(2, "RESERVED_2"), //
		DC_DISCONNECT(3, "DC_DISCONNECT"), //
		RESERVED_4(4, "RESERVED_4"), //
		RESERVED_5(5, "RESERVED_5"), //
		MANUAL_SHUTDOWN(6, "MANUAL_SHUTDOWN"), //
		OVER_TEMPERATURE(7, "OVER_TEMPERATURE"), //
		RESERVED_8(8, "RESERVED_8"), //
		RESERVED_9(9, "RESERVED_9"), //
		RESERVED_10(10, "RESERVED_10"), //
		RESERVED_11(11, "RESERVED_11"), //
		BLOWN_FUSE(12, "BLOWN_FUSE"), //
		UNDER_TEMPERATURE(13, "UNDER_TEMPERATURE"), //
		MEMORY_LOSS(14, "MEMORY_LOSS"), //
		ARC_DETECTION(15, "ARC_DETECTION"), //
		THEFT_DETECTION(16, "THEFT_DETECTION"), //
		OUTPUT_OVER_CURRENT(17, "OUTPUT_OVER_CURRENT"), //
		OUTPUT_OVER_VOLTAGE(18, "OUTPUT_OVER_VOLTAGE"), //
		OUTPUT_UNDER_VOLTAGE(19, "OUTPUT_UNDER_VOLTAGE"), //
		TEST_FAILED(20, "TEST_FAILED"); //

		private final int value;
		private final String name;

		private S2_Evt(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S2_Ctl implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		NONE(0, "NONE"), //
		AUTOMATIC(1, "AUTOMATIC"), //
		FORCE_OFF(2, "FORCE_OFF"), //
		TEST(3, "TEST"), //
		THROTTLE(4, "THROTTLE"); //

		private final int value;
		private final String name;

		private S2_Ctl(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S15 implements SunSpecPoint {
		CLR(new PointImpl(//
				"S15_CLR", //
				"Clear", //
				"Write a \"1\" to clear all counters", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IN_CNT(new PointImpl(//
				"S15_IN_CNT", //
				"Input Count", //
				"Number of bytes received", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IN_UC_CNT(new PointImpl(//
				"S15_IN_UC_CNT", //
				"Input Unicast Count", //
				"Number of Unicast packets received", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IN_N_UC_CNT(new PointImpl(//
				"S15_IN_N_UC_CNT", //
				"Input Non-Unicast Count", //
				"Number of non-Unicast packets received", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IN_DSC_CNT(new PointImpl(//
				"S15_IN_DSC_CNT", //
				"Input Discarded Count", //
				"Number of inbound packets received on the interface but discarded", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IN_ERR_CNT(new PointImpl(//
				"S15_IN_ERR_CNT", //
				"Input Error Count", //
				"Number of inbound packets that contain errors (excluding discards)", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IN_UNK_CNT(new PointImpl(//
				"S15_IN_UNK_CNT", //
				"Input Unknown Count", //
				"Number of inbound packets with unknown protocol", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		OUT_CNT(new PointImpl(//
				"S15_OUT_CNT", //
				"Output Count", //
				"Total number of bytes transmitted on this interface", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		OUT_UC_CNT(new PointImpl(//
				"S15_OUT_UC_CNT", //
				"Output Unicast Count", //
				"Number of Unicast packets transmitted", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		OUT_N_UC_CNT(new PointImpl(//
				"S15_OUT_N_UC_CNT", //
				"Output Non-Unicast Count", //
				"Number of Non-Unicast packets transmitted", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		OUT_DSC_CNT(new PointImpl(//
				"S15_OUT_DSC_CNT", //
				"Output Discarded Count", //
				"Number of Discarded output packets", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		OUT_ERR_CNT(new PointImpl(//
				"S15_OUT_ERR_CNT", //
				"Output Error Count", //
				"Number of outbound error packets", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PAD(new PointImpl(//
				"S15_PAD", //
				"", //
				"", //
				"", //
				PointType.PAD, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S15(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S18 implements SunSpecPoint {
		NAM(new PointImpl(//
				"S18_NAM", //
				"Name", //
				"Interface name", //
				"", //
				PointType.STRING4, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IMEI(new PointImpl(//
				"S18_IMEI", //
				"IMEI", //
				"International Mobile Equipment Identifier for the interface", //
				"", //
				PointType.UINT32, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		APN(new PointImpl(//
				"S18_APN", //
				"APN", //
				"Access Point Name for the interface", //
				"", //
				PointType.STRING4, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		NUM(new PointImpl(//
				"S18_NUM", //
				"Number", //
				"Phone number for the interface", //
				"", //
				PointType.STRING6, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PIN(new PointImpl(//
				"S18_PIN", //
				"PIN", //
				"Personal Identification Number for the interface", //
				"", //
				PointType.STRING6, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S18(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S101 implements SunSpecPoint {
		A(new PointImpl(//
				"S101_A", //
				"Amps", //
				"AC Current", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S101_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"Connected Phase", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S101_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S101_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S101_A_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_A_B(new PointImpl(//
				"S101_P_P_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_B_C(new PointImpl(//
				"S101_P_P_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_C_A(new PointImpl(//
				"S101_P_P_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S101_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S101_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S101_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S101_V_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S101_W", //
				"Watts", //
				"AC Power", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		W_SF(new PointImpl(//
				"S101_W_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S101_HZ", //
				"Hz", //
				"Line Frequency", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				"Hz_SF", //
				new OptionsEnum[0])), //
		HZ_S_F(new PointImpl(//
				"S101_HZ_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S101_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		VA_SF(new PointImpl(//
				"S101_VA_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V_AR(new PointImpl(//
				"S101_V_AR", //
				"VAr", //
				"AC Reactive Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAr_SF", //
				new OptionsEnum[0])), //
		V_AR_S_F(new PointImpl(//
				"S101_V_AR_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S101_PF", //
				"PF", //
				"AC Power Factor", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		PF_SF(new PointImpl(//
				"S101_PF_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WH(new PointImpl(//
				"S101_WH", //
				"WattHours", //
				"AC Energy", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"WH_SF", //
				new OptionsEnum[0])), //
		WH_SF(new PointImpl(//
				"S101_WH_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCA(new PointImpl(//
				"S101_DCA", //
				"DC Amps", //
				"DC Current", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"DCA_SF", //
				new OptionsEnum[0])), //
		DCA_SF(new PointImpl(//
				"S101_DCA_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCV(new PointImpl(//
				"S101_DCV", //
				"DC Voltage", //
				"DC Voltage", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"DCV_SF", //
				new OptionsEnum[0])), //
		DCV_SF(new PointImpl(//
				"S101_DCV_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCW(new PointImpl(//
				"S101_DCW", //
				"DC Watts", //
				"DC Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"DCW_SF", //
				new OptionsEnum[0])), //
		DCW_SF(new PointImpl(//
				"S101_DCW_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TMP_CAB(new PointImpl(//
				"S101_TMP_CAB", //
				"Cabinet Temperature", //
				"Cabinet Temperature", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_SNK(new PointImpl(//
				"S101_TMP_SNK", //
				"Heat Sink Temperature", //
				"Heat Sink Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_TRNS(new PointImpl(//
				"S101_TMP_TRNS", //
				"Transformer Temperature", //
				"Transformer Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_OT(new PointImpl(//
				"S101_TMP_OT", //
				"Other Temperature", //
				"Other Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_S_F(new PointImpl(//
				"S101_TMP_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ST(new PointImpl(//
				"S101_ST", //
				"Operating State", //
				"Enumerated value.  Operating state", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S101_St.values())), //
		ST_VND(new PointImpl(//
				"S101_ST_VND", //
				"Vendor Operating State", //
				"Vendor specific operating state code", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT1(new PointImpl(//
				"S101_EVT1", //
				"Event1", //
				"Bitmask value. Event fields", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S101_Evt1.values())), //
		EVT2(new PointImpl(//
				"S101_EVT2", //
				"Event Bitfield 2", //
				"Reserved for future use", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND1(new PointImpl(//
				"S101_EVT_VND1", //
				"Vendor Event Bitfield 1", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND2(new PointImpl(//
				"S101_EVT_VND2", //
				"Vendor Event Bitfield 2", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND3(new PointImpl(//
				"S101_EVT_VND3", //
				"Vendor Event Bitfield 3", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND4(new PointImpl(//
				"S101_EVT_VND4", //
				"Vendor Event Bitfield 4", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S101(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S101_St implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(1, "OFF"), //
		SLEEPING(2, "SLEEPING"), //
		STARTING(3, "STARTING"), //
		MPPT(4, "MPPT"), //
		THROTTLED(5, "THROTTLED"), //
		SHUTTING_DOWN(6, "SHUTTING_DOWN"), //
		FAULT(7, "FAULT"), //
		STANDBY(8, "STANDBY"); //

		private final int value;
		private final String name;

		private S101_St(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S101_Evt1 implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		GROUND_FAULT(0, "GROUND_FAULT"), //
		DC_OVER_VOLT(1, "DC_OVER_VOLT"), //
		AC_DISCONNECT(2, "AC_DISCONNECT"), //
		DC_DISCONNECT(3, "DC_DISCONNECT"), //
		GRID_DISCONNECT(4, "GRID_DISCONNECT"), //
		CABINET_OPEN(5, "CABINET_OPEN"), //
		MANUAL_SHUTDOWN(6, "MANUAL_SHUTDOWN"), //
		OVER_TEMP(7, "OVER_TEMP"), //
		OVER_FREQUENCY(8, "OVER_FREQUENCY"), //
		UNDER_FREQUENCY(9, "UNDER_FREQUENCY"), //
		AC_OVER_VOLT(10, "AC_OVER_VOLT"), //
		AC_UNDER_VOLT(11, "AC_UNDER_VOLT"), //
		BLOWN_STRING_FUSE(12, "BLOWN_STRING_FUSE"), //
		UNDER_TEMP(13, "UNDER_TEMP"), //
		MEMORY_LOSS(14, "MEMORY_LOSS"), //
		HW_TEST_FAILURE(15, "HW_TEST_FAILURE"); //

		private final int value;
		private final String name;

		private S101_Evt1(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S102 implements SunSpecPoint {
		A(new PointImpl(//
				"S102_A", //
				"Amps", //
				"AC Current", //
				"Sum of active phases", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S102_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"Connected Phase", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S102_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"Connected Phase", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S102_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S102_A_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_A_B(new PointImpl(//
				"S102_P_P_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_B_C(new PointImpl(//
				"S102_P_P_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_C_A(new PointImpl(//
				"S102_P_P_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S102_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S102_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S102_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S102_V_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S102_W", //
				"Watts", //
				"AC Power", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		W_SF(new PointImpl(//
				"S102_W_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S102_HZ", //
				"Hz", //
				"Line Frequency", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				"Hz_SF", //
				new OptionsEnum[0])), //
		HZ_S_F(new PointImpl(//
				"S102_HZ_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S102_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		VA_SF(new PointImpl(//
				"S102_VA_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V_AR(new PointImpl(//
				"S102_V_AR", //
				"VAr", //
				"AC Reactive Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAr_SF", //
				new OptionsEnum[0])), //
		V_AR_S_F(new PointImpl(//
				"S102_V_AR_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S102_PF", //
				"PF", //
				"AC Power Factor", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		PF_SF(new PointImpl(//
				"S102_PF_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WH(new PointImpl(//
				"S102_WH", //
				"WattHours", //
				"AC Energy", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"WH_SF", //
				new OptionsEnum[0])), //
		WH_SF(new PointImpl(//
				"S102_WH_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCA(new PointImpl(//
				"S102_DCA", //
				"DC Amps", //
				"DC Current", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"DCA_SF", //
				new OptionsEnum[0])), //
		DCA_SF(new PointImpl(//
				"S102_DCA_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCV(new PointImpl(//
				"S102_DCV", //
				"DC Voltage", //
				"DC Voltage", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"DCV_SF", //
				new OptionsEnum[0])), //
		DCV_SF(new PointImpl(//
				"S102_DCV_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCW(new PointImpl(//
				"S102_DCW", //
				"DC Watts", //
				"DC Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"DCW_SF", //
				new OptionsEnum[0])), //
		DCW_SF(new PointImpl(//
				"S102_DCW_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TMP_CAB(new PointImpl(//
				"S102_TMP_CAB", //
				"Cabinet Temperature", //
				"Cabinet Temperature", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_SNK(new PointImpl(//
				"S102_TMP_SNK", //
				"Heat Sink Temperature", //
				"Heat Sink Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_TRNS(new PointImpl(//
				"S102_TMP_TRNS", //
				"Transformer Temperature", //
				"Transformer Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_OT(new PointImpl(//
				"S102_TMP_OT", //
				"Other Temperature", //
				"Other Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_S_F(new PointImpl(//
				"S102_TMP_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ST(new PointImpl(//
				"S102_ST", //
				"Operating State", //
				"Enumerated value.  Operating state", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S102_St.values())), //
		ST_VND(new PointImpl(//
				"S102_ST_VND", //
				"Vendor Operating State", //
				"Vendor specific operating state code", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT1(new PointImpl(//
				"S102_EVT1", //
				"Event1", //
				"Bitmask value. Event fields", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S102_Evt1.values())), //
		EVT2(new PointImpl(//
				"S102_EVT2", //
				"Event Bitfield 2", //
				"Reserved for future use", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND1(new PointImpl(//
				"S102_EVT_VND1", //
				"Vendor Event Bitfield 1", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND2(new PointImpl(//
				"S102_EVT_VND2", //
				"Vendor Event Bitfield 2", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND3(new PointImpl(//
				"S102_EVT_VND3", //
				"Vendor Event Bitfield 3", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND4(new PointImpl(//
				"S102_EVT_VND4", //
				"Vendor Event Bitfield 4", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S102(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S102_St implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(1, "OFF"), //
		SLEEPING(2, "SLEEPING"), //
		STARTING(3, "STARTING"), //
		MPPT(4, "MPPT"), //
		THROTTLED(5, "THROTTLED"), //
		SHUTTING_DOWN(6, "SHUTTING_DOWN"), //
		FAULT(7, "FAULT"), //
		STANDBY(8, "STANDBY"); //

		private final int value;
		private final String name;

		private S102_St(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S102_Evt1 implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		GROUND_FAULT(0, "GROUND_FAULT"), //
		DC_OVER_VOLT(1, "DC_OVER_VOLT"), //
		AC_DISCONNECT(2, "AC_DISCONNECT"), //
		DC_DISCONNECT(3, "DC_DISCONNECT"), //
		GRID_DISCONNECT(4, "GRID_DISCONNECT"), //
		CABINET_OPEN(5, "CABINET_OPEN"), //
		MANUAL_SHUTDOWN(6, "MANUAL_SHUTDOWN"), //
		OVER_TEMP(7, "OVER_TEMP"), //
		OVER_FREQUENCY(8, "OVER_FREQUENCY"), //
		UNDER_FREQUENCY(9, "UNDER_FREQUENCY"), //
		AC_OVER_VOLT(10, "AC_OVER_VOLT"), //
		AC_UNDER_VOLT(11, "AC_UNDER_VOLT"), //
		BLOWN_STRING_FUSE(12, "BLOWN_STRING_FUSE"), //
		UNDER_TEMP(13, "UNDER_TEMP"), //
		MEMORY_LOSS(14, "MEMORY_LOSS"), //
		HW_TEST_FAILURE(15, "HW_TEST_FAILURE"); //

		private final int value;
		private final String name;

		private S102_Evt1(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S103 implements SunSpecPoint {
		A(new PointImpl(//
				"S103_A", //
				"Amps", //
				"AC Current", //
				"Sum of active phases", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S103_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"Connected Phase", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S103_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"Connected Phase", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S103_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"Connected Phase", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S103_A_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_A_B(new PointImpl(//
				"S103_P_P_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_B_C(new PointImpl(//
				"S103_P_P_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_C_A(new PointImpl(//
				"S103_P_P_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S103_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S103_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S103_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S103_V_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S103_W", //
				"Watts", //
				"AC Power", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		W_SF(new PointImpl(//
				"S103_W_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S103_HZ", //
				"Hz", //
				"Line Frequency", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				"Hz_SF", //
				new OptionsEnum[0])), //
		HZ_S_F(new PointImpl(//
				"S103_HZ_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S103_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		VA_SF(new PointImpl(//
				"S103_VA_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V_AR(new PointImpl(//
				"S103_V_AR", //
				"VAr", //
				"AC Reactive Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAr_SF", //
				new OptionsEnum[0])), //
		V_AR_S_F(new PointImpl(//
				"S103_V_AR_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S103_PF", //
				"PF", //
				"AC Power Factor", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		PF_SF(new PointImpl(//
				"S103_PF_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WH(new PointImpl(//
				"S103_WH", //
				"WattHours", //
				"AC Energy", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"WH_SF", //
				new OptionsEnum[0])), //
		WH_SF(new PointImpl(//
				"S103_WH_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCA(new PointImpl(//
				"S103_DCA", //
				"DC Amps", //
				"DC Current", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"DCA_SF", //
				new OptionsEnum[0])), //
		DCA_SF(new PointImpl(//
				"S103_DCA_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCV(new PointImpl(//
				"S103_DCV", //
				"DC Voltage", //
				"DC Voltage", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"DCV_SF", //
				new OptionsEnum[0])), //
		DCV_SF(new PointImpl(//
				"S103_DCV_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DCW(new PointImpl(//
				"S103_DCW", //
				"DC Watts", //
				"DC Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"DCW_SF", //
				new OptionsEnum[0])), //
		DCW_SF(new PointImpl(//
				"S103_DCW_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TMP_CAB(new PointImpl(//
				"S103_TMP_CAB", //
				"Cabinet Temperature", //
				"Cabinet Temperature", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_SNK(new PointImpl(//
				"S103_TMP_SNK", //
				"Heat Sink Temperature", //
				"Heat Sink Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_TRNS(new PointImpl(//
				"S103_TMP_TRNS", //
				"Transformer Temperature", //
				"Transformer Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_OT(new PointImpl(//
				"S103_TMP_OT", //
				"Other Temperature", //
				"Other Temperature", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Tmp_SF", //
				new OptionsEnum[0])), //
		TMP_S_F(new PointImpl(//
				"S103_TMP_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ST(new PointImpl(//
				"S103_ST", //
				"Operating State", //
				"Enumerated value.  Operating state", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S103_St.values())), //
		ST_VND(new PointImpl(//
				"S103_ST_VND", //
				"Vendor Operating State", //
				"Vendor specific operating state code", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT1(new PointImpl(//
				"S103_EVT1", //
				"Event1", //
				"Bitmask value. Event fields", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S103_Evt1.values())), //
		EVT2(new PointImpl(//
				"S103_EVT2", //
				"Event Bitfield 2", //
				"Reserved for future use", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND1(new PointImpl(//
				"S103_EVT_VND1", //
				"Vendor Event Bitfield 1", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND2(new PointImpl(//
				"S103_EVT_VND2", //
				"Vendor Event Bitfield 2", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND3(new PointImpl(//
				"S103_EVT_VND3", //
				"Vendor Event Bitfield 3", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND4(new PointImpl(//
				"S103_EVT_VND4", //
				"Vendor Event Bitfield 4", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S103(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S103_St implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(1, "OFF"), //
		SLEEPING(2, "SLEEPING"), //
		STARTING(3, "STARTING"), //
		MPPT(4, "MPPT"), //
		THROTTLED(5, "THROTTLED"), //
		SHUTTING_DOWN(6, "SHUTTING_DOWN"), //
		FAULT(7, "FAULT"), //
		STANDBY(8, "STANDBY"); //

		private final int value;
		private final String name;

		private S103_St(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S103_Evt1 implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		GROUND_FAULT(0, "GROUND_FAULT"), //
		DC_OVER_VOLT(1, "DC_OVER_VOLT"), //
		AC_DISCONNECT(2, "AC_DISCONNECT"), //
		DC_DISCONNECT(3, "DC_DISCONNECT"), //
		GRID_DISCONNECT(4, "GRID_DISCONNECT"), //
		CABINET_OPEN(5, "CABINET_OPEN"), //
		MANUAL_SHUTDOWN(6, "MANUAL_SHUTDOWN"), //
		OVER_TEMP(7, "OVER_TEMP"), //
		OVER_FREQUENCY(8, "OVER_FREQUENCY"), //
		UNDER_FREQUENCY(9, "UNDER_FREQUENCY"), //
		AC_OVER_VOLT(10, "AC_OVER_VOLT"), //
		AC_UNDER_VOLT(11, "AC_UNDER_VOLT"), //
		BLOWN_STRING_FUSE(12, "BLOWN_STRING_FUSE"), //
		UNDER_TEMP(13, "UNDER_TEMP"), //
		MEMORY_LOSS(14, "MEMORY_LOSS"), //
		HW_TEST_FAILURE(15, "HW_TEST_FAILURE"); //

		private final int value;
		private final String name;

		private S103_Evt1(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S111 implements SunSpecPoint {
		A(new PointImpl(//
				"S111_A", //
				"Amps", //
				"AC Current", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S111_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"Connected Phase", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S111_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S111_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_A_B(new PointImpl(//
				"S111_P_P_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_B_C(new PointImpl(//
				"S111_P_P_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_C_A(new PointImpl(//
				"S111_P_P_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S111_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S111_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S111_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S111_W", //
				"Watts", //
				"AC Power", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S111_HZ", //
				"Hz", //
				"Line Frequency", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S111_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				null, //
				new OptionsEnum[0])), //
		V_AR(new PointImpl(//
				"S111_V_AR", //
				"VAr", //
				"AC Reactive Power", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S111_PF", //
				"PF", //
				"AC Power Factor", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WH(new PointImpl(//
				"S111_WH", //
				"WattHours", //
				"AC Energy", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				null, //
				new OptionsEnum[0])), //
		DCA(new PointImpl(//
				"S111_DCA", //
				"DC Amps", //
				"DC Current", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		DCV(new PointImpl(//
				"S111_DCV", //
				"DC Voltage", //
				"DC Voltage", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		DCW(new PointImpl(//
				"S111_DCW", //
				"DC Watts", //
				"DC Power", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				null, //
				new OptionsEnum[0])), //
		TMP_CAB(new PointImpl(//
				"S111_TMP_CAB", //
				"Cabinet Temperature", //
				"Cabinet Temperature", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				null, //
				new OptionsEnum[0])), //
		TMP_SNK(new PointImpl(//
				"S111_TMP_SNK", //
				"Heat Sink Temperature", //
				"Heat Sink Temperature", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				null, //
				new OptionsEnum[0])), //
		TMP_TRNS(new PointImpl(//
				"S111_TMP_TRNS", //
				"Transformer Temperature", //
				"Transformer Temperature", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				null, //
				new OptionsEnum[0])), //
		TMP_OT(new PointImpl(//
				"S111_TMP_OT", //
				"Other Temperature", //
				"Other Temperature", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				null, //
				new OptionsEnum[0])), //
		ST(new PointImpl(//
				"S111_ST", //
				"Operating State", //
				"Enumerated value.  Operating state", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S111_St.values())), //
		ST_VND(new PointImpl(//
				"S111_ST_VND", //
				"Vendor Operating State", //
				"Vendor specific operating state code", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT1(new PointImpl(//
				"S111_EVT1", //
				"Event1", //
				"Bitmask value. Event fields", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S111_Evt1.values())), //
		EVT2(new PointImpl(//
				"S111_EVT2", //
				"Event Bitfield 2", //
				"Reserved for future use", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND1(new PointImpl(//
				"S111_EVT_VND1", //
				"Vendor Event Bitfield 1", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND2(new PointImpl(//
				"S111_EVT_VND2", //
				"Vendor Event Bitfield 2", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND3(new PointImpl(//
				"S111_EVT_VND3", //
				"Vendor Event Bitfield 3", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND4(new PointImpl(//
				"S111_EVT_VND4", //
				"Vendor Event Bitfield 4", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S111(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S111_St implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(1, "OFF"), //
		SLEEPING(2, "SLEEPING"), //
		STARTING(3, "STARTING"), //
		GG_M_P_P_T(4, "GG_M_P_P_T"), //
		THROTTLED(5, "THROTTLED"), //
		SHUTTING_DOWN(6, "SHUTTING_DOWN"), //
		FAULT(7, "FAULT"), //
		STANDBY(8, "STANDBY"); //

		private final int value;
		private final String name;

		private S111_St(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S111_Evt1 implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		GROUND_FAULT(0, "GROUND_FAULT"), //
		DC_OVER_VOLT(1, "DC_OVER_VOLT"), //
		AC_DISCONNECT(2, "AC_DISCONNECT"), //
		DC_DISCONNECT(3, "DC_DISCONNECT"), //
		GRID_DISCONNECT(4, "GRID_DISCONNECT"), //
		CABINET_OPEN(5, "CABINET_OPEN"), //
		MANUAL_SHUTDOWN(6, "MANUAL_SHUTDOWN"), //
		OVER_TEMP(7, "OVER_TEMP"), //
		OVER_FREQUENCY(8, "OVER_FREQUENCY"), //
		UNDER_FREQUENCY(9, "UNDER_FREQUENCY"), //
		AC_OVER_VOLT(10, "AC_OVER_VOLT"), //
		AC_UNDER_VOLT(11, "AC_UNDER_VOLT"), //
		BLOWN_STRING_FUSE(12, "BLOWN_STRING_FUSE"), //
		UNDER_TEMP(13, "UNDER_TEMP"), //
		MEMORY_LOSS(14, "MEMORY_LOSS"), //
		HW_TEST_FAILURE(15, "HW_TEST_FAILURE"); //

		private final int value;
		private final String name;

		private S111_Evt1(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S112 implements SunSpecPoint {
		A(new PointImpl(//
				"S112_A", //
				"Amps", //
				"AC Current", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S112_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"Connected Phase", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S112_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"Connected Phase", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S112_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_A_B(new PointImpl(//
				"S112_P_P_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_B_C(new PointImpl(//
				"S112_P_P_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		P_P_VPH_C_A(new PointImpl(//
				"S112_P_P_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S112_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S112_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S112_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S112_W", //
				"Watts", //
				"AC Power", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S112_HZ", //
				"Hz", //
				"Line Frequency", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S112_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				null, //
				new OptionsEnum[0])), //
		V_AR(new PointImpl(//
				"S112_V_AR", //
				"VAr", //
				"AC Reactive Power", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S112_PF", //
				"PF", //
				"AC Power Factor", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WH(new PointImpl(//
				"S112_WH", //
				"WattHours", //
				"AC Energy", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				null, //
				new OptionsEnum[0])), //
		DCA(new PointImpl(//
				"S112_DCA", //
				"DC Amps", //
				"DC Current", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				null, //
				new OptionsEnum[0])), //
		DCV(new PointImpl(//
				"S112_DCV", //
				"DC Voltage", //
				"DC Voltage", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				null, //
				new OptionsEnum[0])), //
		DCW(new PointImpl(//
				"S112_DCW", //
				"DC Watts", //
				"DC Power", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				null, //
				new OptionsEnum[0])), //
		TMP_CAB(new PointImpl(//
				"S112_TMP_CAB", //
				"Cabinet Temperature", //
				"Cabinet Temperature", //
				"", //
				PointType.FLOAT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				null, //
				new OptionsEnum[0])), //
		TMP_SNK(new PointImpl(//
				"S112_TMP_SNK", //
				"Heat Sink Temperature", //
				"Heat Sink Temperature", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				null, //
				new OptionsEnum[0])), //
		TMP_TRNS(new PointImpl(//
				"S112_TMP_TRNS", //
				"Transformer Temperature", //
				"Transformer Temperature", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				null, //
				new OptionsEnum[0])), //
		TMP_OT(new PointImpl(//
				"S112_TMP_OT", //
				"Other Temperature", //
				"Other Temperature", //
				"", //
				PointType.FLOAT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				null, //
				new OptionsEnum[0])), //
		ST(new PointImpl(//
				"S112_ST", //
				"Operating State", //
				"Enumerated value.  Operating state", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S112_St.values())), //
		ST_VND(new PointImpl(//
				"S112_ST_VND", //
				"Vendor Operating State", //
				"Vendor specific operating state code", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT1(new PointImpl(//
				"S112_EVT1", //
				"Event1", //
				"Bitmask value. Event fields", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S112_Evt1.values())), //
		EVT2(new PointImpl(//
				"S112_EVT2", //
				"Event Bitfield 2", //
				"Reserved for future use", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND1(new PointImpl(//
				"S112_EVT_VND1", //
				"Vendor Event Bitfield 1", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND2(new PointImpl(//
				"S112_EVT_VND2", //
				"Vendor Event Bitfield 2", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND3(new PointImpl(//
				"S112_EVT_VND3", //
				"Vendor Event Bitfield 3", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND4(new PointImpl(//
				"S112_EVT_VND4", //
				"Vendor Event Bitfield 4", //
				"Vendor defined events", //
				"", //
				PointType.BITFIELD32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S112(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S112_St implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(1, "OFF"), //
		SLEEPING(2, "SLEEPING"), //
		STARTING(3, "STARTING"), //
		MPPT(4, "MPPT"), //
		THROTTLED(5, "THROTTLED"), //
		SHUTTING_DOWN(6, "SHUTTING_DOWN"), //
		FAULT(7, "FAULT"), //
		STANDBY(8, "STANDBY"); //

		private final int value;
		private final String name;

		private S112_St(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}
=======
public interface SunSpecModel {
>>>>>>> develop

	/**
	 * The name of the SunSpec Model.
	 * 
	 * It is expected to be "S_<Block-ID>", e.g. for the common Block-ID "1" the
	 * expected name is "S_1".
	 * 
	 * @return the name as String
	 */
	public String name();

	/**
	 * Gets the SunSpec Block-ID as integer.
	 * 
	 * @return the Block-ID
	 */
	public default int getBlockId() {
		return Integer.valueOf(this.name().substring(2));
	}

	public String label();

	public SunSpecPoint[] points();

<<<<<<< HEAD
		private final int value;
		private final String name;

		private S123_OutPFSet_Ena(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S123_VArPct_Mod implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		NONE(0, "NONE"), //
		W_MAX(1, "W_MAX"), //
		V_AR_MAX(2, "V_AR_MAX"), //
		V_AR_AVAL(3, "V_AR_AVAL"); //

		private final int value;
		private final String name;

		private S123_VArPct_Mod(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S123_VArPct_Ena implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		DISABLED(0, "DISABLED"), //
		ENABLED(1, "ENABLED"); //

		private final int value;
		private final String name;

		private S123_VArPct_Ena(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S124 implements SunSpecPoint {
		W_CHA_MAX(new PointImpl(//
				"S124_W_CHA_MAX", //
				"WChaMax", //
				"Setpoint for maximum charge.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.WATT, //
				"WChaMax_SF", //
				new OptionsEnum[0])), //
		W_CHA_GRA(new PointImpl(//
				"S124_W_CHA_GRA", //
				"WChaGra", //
				"Setpoint for maximum charging rate. Default is MaxChaRte.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"WChaDisChaGra_SF", //
				new OptionsEnum[0])), //
		W_DIS_CHA_GRA(new PointImpl(//
				"S124_W_DIS_CHA_GRA", //
				"WDisChaGra", //
				"Setpoint for maximum discharge rate. Default is MaxDisChaRte.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"WChaDisChaGra_SF", //
				new OptionsEnum[0])), //
		STOR_CTL_MOD(new PointImpl(//
				"S124_STOR_CTL_MOD", //
				"StorCtl_Mod", //
				"Activate hold/discharge/charge storage control mode. Bitfield value.", //
				"", //
				PointType.BITFIELD16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S124_StorCtl_Mod.values())), //
		V_A_CHA_MAX(new PointImpl(//
				"S124_V_A_CHA_MAX", //
				"VAChaMax", //
				"Setpoint for maximum charging VA.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.VOLT_AMPERE, //
				"VAChaMax_SF", //
				new OptionsEnum[0])), //
		MIN_RSV_PCT(new PointImpl(//
				"S124_MIN_RSV_PCT", //
				"MinRsvPct", //
				"Setpoint for minimum reserve for storage as a percentage of the nominal maximum storage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"MinRsvPct_SF", //
				new OptionsEnum[0])), //
		CHA_STATE(new PointImpl(//
				"S124_CHA_STATE", //
				"ChaState", //
				"Currently available energy as a percent of the capacity rating.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.PERCENT, //
				"ChaState_SF", //
				new OptionsEnum[0])), //
		STOR_AVAL(new PointImpl(//
				"S124_STOR_AVAL", //
				"StorAval", //
				"State of charge (ChaState) minus storage reserve (MinRsvPct) times capacity rating (AhrRtg).", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE_HOURS, //
				"StorAval_SF", //
				new OptionsEnum[0])), //
		IN_BAT_V(new PointImpl(//
				"S124_IN_BAT_V", //
				"InBatV", //
				"Internal battery voltage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"InBatV_SF", //
				new OptionsEnum[0])), //
		CHA_ST(new PointImpl(//
				"S124_CHA_ST", //
				"ChaSt", //
				"Charge status of storage device. Enumerated value.", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S124_ChaSt.values())), //
		OUT_W_RTE(new PointImpl(//
				"S124_OUT_W_RTE", //
				"OutWRte", //
				"Percent of max discharge rate.", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"InOutWRte_SF", //
				new OptionsEnum[0])), //
		IN_W_RTE(new PointImpl(//
				"S124_IN_W_RTE", //
				"InWRte", //
				"Percent of max charging rate.", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"InOutWRte_SF", //
				new OptionsEnum[0])), //
		IN_OUT_W_RTE_WIN_TMS(new PointImpl(//
				"S124_IN_OUT_W_RTE_WIN_TMS", //
				"InOutWRte_WinTms", //
				"Time window for charge/discharge rate change.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.SECONDS, //
				null, //
				new OptionsEnum[0])), //
		IN_OUT_W_RTE_RVRT_TMS(new PointImpl(//
				"S124_IN_OUT_W_RTE_RVRT_TMS", //
				"InOutWRte_RvrtTms", //
				"Timeout period for charge/discharge rate.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.SECONDS, //
				null, //
				new OptionsEnum[0])), //
		IN_OUT_W_RTE_RMP_TMS(new PointImpl(//
				"S124_IN_OUT_W_RTE_RMP_TMS", //
				"InOutWRte_RmpTms", //
				"Ramp time for moving from current setpoint to new setpoint.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.SECONDS, //
				null, //
				new OptionsEnum[0])), //
		CHA_GRI_SET(new PointImpl(//
				"S124_CHA_GRI_SET", //
				"", //
				"", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S124_ChaGriSet.values())), //
		W_CHA_MAX_S_F(new PointImpl(//
				"S124_W_CHA_MAX_S_F", //
				"WChaMax_SF", //
				"Scale factor for maximum charge.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W_CHA_DIS_CHA_GRA_S_F(new PointImpl(//
				"S124_W_CHA_DIS_CHA_GRA_S_F", //
				"WChaDisChaGra_SF", //
				"Scale factor for maximum charge and discharge rate.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V_A_CHA_MAX_S_F(new PointImpl(//
				"S124_V_A_CHA_MAX_S_F", //
				"VAChaMax_SF", //
				"Scale factor for maximum charging VA.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		MIN_RSV_PCT_S_F(new PointImpl(//
				"S124_MIN_RSV_PCT_S_F", //
				"MinRsvPct_SF", //
				"Scale factor for minimum reserve percentage.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CHA_STATE_S_F(new PointImpl(//
				"S124_CHA_STATE_S_F", //
				"ChaState_SF", //
				"Scale factor for available energy percent.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		STOR_AVAL_S_F(new PointImpl(//
				"S124_STOR_AVAL_S_F", //
				"StorAval_SF", //
				"Scale factor for state of charge.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IN_BAT_V_S_F(new PointImpl(//
				"S124_IN_BAT_V_S_F", //
				"InBatV_SF", //
				"Scale factor for battery voltage.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		IN_OUT_W_RTE_S_F(new PointImpl(//
				"S124_IN_OUT_W_RTE_S_F", //
				"InOutWRte_SF", //
				"Scale factor for percent charge/discharge rate.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S124(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S124_StorCtl_Mod implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		CHARGE(0, "CHARGE"), //
		DI_S_C_H_A_R_G_E(1, "DI_S_C_H_A_R_G_E"); //

		private final int value;
		private final String name;

		private S124_StorCtl_Mod(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S124_ChaSt implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(1, "OFF"), //
		EMPTY(2, "EMPTY"), //
		DISCHARGING(3, "DISCHARGING"), //
		CHARGING(4, "CHARGING"), //
		FULL(5, "FULL"), //
		HOLDING(6, "HOLDING"), //
		TESTING(7, "TESTING"); //

		private final int value;
		private final String name;

		private S124_ChaSt(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S124_ChaGriSet implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		PV(0, "PV"), //
		GRID(1, "GRID"); //

		private final int value;
		private final String name;

		private S124_ChaGriSet(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S125 implements SunSpecPoint {
		MOD_ENA(new PointImpl(//
				"S125_MOD_ENA", //
				"ModEna", //
				"Is price-based charge/dischage mode active?", //
				"", //
				PointType.BITFIELD16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S125_ModEna.values())), //
		SIG_TYPE(new PointImpl(//
				"S125_SIG_TYPE", //
				"SigType", //
				"Meaning of the pricing signal. When a Price schedule is used, type must match the schedule range variable description.", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S125_SigType.values())), //
		SIG(new PointImpl(//
				"S125_SIG", //
				"Sig", //
				"Utility/ESP specific pricing signal. Content depends on pricing signal type. When H/M/L type is specified. Low=0; Med=1; High=2.", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"Sig_SF", //
				new OptionsEnum[0])), //
		WIN_TMS(new PointImpl(//
				"S125_WIN_TMS", //
				"WinTms", //
				"Time window for charge/discharge pricing change.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.SECONDS, //
				null, //
				new OptionsEnum[0])), //
		RVT_TMS(new PointImpl(//
				"S125_RVT_TMS", //
				"RvtTms", //
				"Timeout period for charge/discharge pricing change.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.SECONDS, //
				null, //
				new OptionsEnum[0])), //
		RMP_TMS(new PointImpl(//
				"S125_RMP_TMS", //
				"RmpTms", //
				"Ramp time for moving from current charge or discharge level to new level.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.SECONDS, //
				null, //
				new OptionsEnum[0])), //
		SIG_S_F(new PointImpl(//
				"S125_SIG_S_F", //
				"Sig_SF", //
				"Pricing signal scale factor.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PAD(new PointImpl(//
				"S125_PAD", //
				"", //
				"", //
				"", //
				PointType.PAD, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S125(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S125_ModEna implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		ENABLE(0, "ENABLE"); //

		private final int value;
		private final String name;

		private S125_ModEna(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S125_SigType implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		UNKNOWN(0, "UNKNOWN"), //
		ABSOLUTE(1, "ABSOLUTE"), //
		RELATIVE(2, "RELATIVE"), //
		MULTIPLIER(3, "MULTIPLIER"), //
		LEVEL(4, "LEVEL"); //

		private final int value;
		private final String name;

		private S125_SigType(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S127 implements SunSpecPoint {
		W_GRA(new PointImpl(//
				"S127_W_GRA", //
				"WGra", //
				"The slope of the reduction in the maximum allowed watts output as a function of frequency.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"WGra_SF", //
				new OptionsEnum[0])), //
		HZ_STR(new PointImpl(//
				"S127_HZ_STR", //
				"HzStr", //
				"The frequency deviation from nominal frequency (ECPNomHz) at which a snapshot of the instantaneous power output is taken to act as the CAPPED power level (PM) and above which reduction in power output occurs.", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.HERTZ, //
				"HzStrStop_SF", //
				new OptionsEnum[0])), //
		HZ_STOP(new PointImpl(//
				"S127_HZ_STOP", //
				"HzStop", //
				"The frequency deviation from nominal frequency (ECPNomHz) at which curtailed power output may return to normal and the cap on the power level value is removed.", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.HERTZ, //
				"HzStrStop_SF", //
				new OptionsEnum[0])), //
		HYS_ENA(new PointImpl(//
				"S127_HYS_ENA", //
				"HysEna", //
				"Enable hysterisis", //
				"", //
				PointType.BITFIELD16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S127_HysEna.values())), //
		MOD_ENA(new PointImpl(//
				"S127_MOD_ENA", //
				"ModEna", //
				"Is Parameterized Frequency-Watt control active.", //
				"", //
				PointType.BITFIELD16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S127_ModEna.values())), //
		HZ_STOP_W_GRA(new PointImpl(//
				"S127_HZ_STOP_W_GRA", //
				"HzStopWGra", //
				"The maximum time-based rate of change at which power output returns to normal after having been capped by an over frequency event.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"RmpIncDec_SF", //
				new OptionsEnum[0])), //
		W_GRA_S_F(new PointImpl(//
				"S127_W_GRA_S_F", //
				"WGra_SF", //
				"Scale factor for output gradient.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		HZ_STR_STOP_S_F(new PointImpl(//
				"S127_HZ_STR_STOP_S_F", //
				"HzStrStop_SF", //
				"Scale factor for frequency deviations.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		RMP_INC_DEC_S_F(new PointImpl(//
				"S127_RMP_INC_DEC_S_F", //
				"RmpIncDec_SF", //
				"Scale factor for increment and decrement ramps.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PAD(new PointImpl(//
				"S127_PAD", //
				"", //
				"", //
				"", //
				PointType.PAD, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S127(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S127_HysEna implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		ENABLED(0, "ENABLED"); //

		private final int value;
		private final String name;

		private S127_HysEna(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S127_ModEna implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		ENABLED(0, "ENABLED"); //

		private final int value;
		private final String name;

		private S127_ModEna(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S128 implements SunSpecPoint {
		AR_GRA_MOD(new PointImpl(//
				"S128_AR_GRA_MOD", //
				"ArGraMod", //
				"Indicates if gradients trend toward zero at the edges of the deadband or trend toward zero at the center of the deadband.", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S128_ArGraMod.values())), //
		AR_GRA_SAG(new PointImpl(//
				"S128_AR_GRA_SAG", //
				"ArGraSag", //
				"The gradient used to increase capacitive dynamic current. A value of 0 indicates no additional reactive current support.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"ArGra_SF", //
				new OptionsEnum[0])), //
		AR_GRA_SWELL(new PointImpl(//
				"S128_AR_GRA_SWELL", //
				"ArGraSwell", //
				"The gradient used to increase inductive dynamic current.  A value of 0 indicates no additional reactive current support.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"ArGra_SF", //
				new OptionsEnum[0])), //
		MOD_ENA(new PointImpl(//
				"S128_MOD_ENA", //
				"ModEna", //
				"Activate dynamic reactive current model", //
				"", //
				PointType.BITFIELD16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S128_ModEna.values())), //
		FIL_TMS(new PointImpl(//
				"S128_FIL_TMS", //
				"FilTms", //
				"The time window used to calculate the moving average voltage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.SECONDS, //
				null, //
				new OptionsEnum[0])), //
		DB_V_MIN(new PointImpl(//
				"S128_DB_V_MIN", //
				"DbVMin", //
				"The lower delta voltage limit for which negative voltage deviations less than this value no dynamic vars are produced.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"VRefPct_SF", //
				new OptionsEnum[0])), //
		DB_V_MAX(new PointImpl(//
				"S128_DB_V_MAX", //
				"DbVMax", //
				"The upper delta voltage limit for which positive voltage deviations less than this value no dynamic current produced.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"VRefPct_SF", //
				new OptionsEnum[0])), //
		BLK_ZN_V(new PointImpl(//
				"S128_BLK_ZN_V", //
				"BlkZnV", //
				"Block zone voltage which defines a lower voltage boundary below which no dynamic current is produced.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"VRefPct_SF", //
				new OptionsEnum[0])), //
		HYS_BLK_ZN_V(new PointImpl(//
				"S128_HYS_BLK_ZN_V", //
				"HysBlkZnV", //
				"Hysteresis voltage used with BlkZnV.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"VRefPct_SF", //
				new OptionsEnum[0])), //
		BLK_ZN_TMMS(new PointImpl(//
				"S128_BLK_ZN_TMMS", //
				"BlkZnTmms", //
				"Block zone time the time before which reactive current support remains active regardless of how low the voltage drops.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.MILLISECONDS, //
				null, //
				new OptionsEnum[0])), //
		HOLD_TMMS(new PointImpl(//
				"S128_HOLD_TMMS", //
				"HoldTmms", //
				"Hold time during which reactive current support continues after the average voltage has entered the dead zone.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.MILLISECONDS, //
				null, //
				new OptionsEnum[0])), //
		AR_GRA_S_F(new PointImpl(//
				"S128_AR_GRA_S_F", //
				"ArGra_SF", //
				"Scale factor for the gradients.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V_REF_PCT_S_F(new PointImpl(//
				"S128_V_REF_PCT_S_F", //
				"VRefPct_SF", //
				"Scale factor for the voltage zone and limit settings.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PAD(new PointImpl(//
				"S128_PAD", //
				"", //
				"", //
				"", //
				PointType.PAD, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S128(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S128_ArGraMod implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		EDGE(0, "EDGE"), //
		CENTER(1, "CENTER"); //

		private final int value;
		private final String name;

		private S128_ArGraMod(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S128_ModEna implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		ENABLED(0, "ENABLED"); //

		private final int value;
		private final String name;

		private S128_ModEna(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S145 implements SunSpecPoint {
		NOM_RMP_UP_RTE(new PointImpl(//
				"S145_NOM_RMP_UP_RTE", //
				"Ramp Up Rate", //
				"Ramp up rate as a percentage of max current.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"Rmp_SF", //
				new OptionsEnum[0])), //
		NOM_RMP_DN_RTE(new PointImpl(//
				"S145_NOM_RMP_DN_RTE", //
				"NomRmpDnRte", //
				"Ramp down rate as a percentage of max current.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"Rmp_SF", //
				new OptionsEnum[0])), //
		EMG_RMP_UP_RTE(new PointImpl(//
				"S145_EMG_RMP_UP_RTE", //
				"Emergency Ramp Up Rate", //
				"Emergency ramp up rate as a percentage of max current.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"Rmp_SF", //
				new OptionsEnum[0])), //
		EMG_RMP_DN_RTE(new PointImpl(//
				"S145_EMG_RMP_DN_RTE", //
				"Emergency Ramp Down Rate", //
				"Emergency ramp down rate as a percentage of max current.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"Rmp_SF", //
				new OptionsEnum[0])), //
		CONN_RMP_UP_RTE(new PointImpl(//
				"S145_CONN_RMP_UP_RTE", //
				"Connect Ramp Up Rate", //
				"Connect ramp up rate as a percentage of max current.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"Rmp_SF", //
				new OptionsEnum[0])), //
		CONN_RMP_DN_RTE(new PointImpl(//
				"S145_CONN_RMP_DN_RTE", //
				"Connect Ramp Down Rate", //
				"Connect ramp down rate as a percentage of max current.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"Rmp_SF", //
				new OptionsEnum[0])), //
		A_GRA(new PointImpl(//
				"S145_A_GRA", //
				"Default Ramp Rate", //
				"Ramp rate specified in percent of max current.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				"Rmp_SF", //
				new OptionsEnum[0])), //
		RMP_S_F(new PointImpl(//
				"S145_RMP_S_F", //
				"Ramp Rate Scale Factor", //
				"Ramp Rate Scale Factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S145(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S201 implements SunSpecPoint {
		A(new PointImpl(//
				"S201_A", //
				"Amps", //
				"Total AC Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S201_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S201_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S201_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S201_A_SF", //
				"", //
				"Current scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PH_V(new PointImpl(//
				"S201_PH_V", //
				"Voltage LN", //
				"Line to Neutral AC Voltage (average of active phases)", //
				"Conditional AN connection", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S201_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"Conditional AN connection", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S201_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S201_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PPV(new PointImpl(//
				"S201_PPV", //
				"Voltage LL", //
				"Line to Line AC Voltage (average of active phases)", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_A_B(new PointImpl(//
				"S201_P_P_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_B_C(new PointImpl(//
				"S201_P_P_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		P_P_VPH_C_A(new PointImpl(//
				"S201_P_P_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S201_V_SF", //
				"", //
				"Voltage scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S201_HZ", //
				"Hz", //
				"Frequency", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				"Hz_SF", //
				new OptionsEnum[0])), //
		HZ_S_F(new PointImpl(//
				"S201_HZ_S_F", //
				"", //
				"Frequency scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S201_W", //
				"Watts", //
				"Total Real Power", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_A(new PointImpl(//
				"S201_WPH_A", //
				"Watts phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_B(new PointImpl(//
				"S201_WPH_B", //
				"Watts phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_C(new PointImpl(//
				"S201_WPH_C", //
				"Watts phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		W_SF(new PointImpl(//
				"S201_W_SF", //
				"", //
				"Real Power scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S201_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_A(new PointImpl(//
				"S201_V_APH_A", //
				"VA phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_B(new PointImpl(//
				"S201_V_APH_B", //
				"VA phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_C(new PointImpl(//
				"S201_V_APH_C", //
				"VA phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		VA_SF(new PointImpl(//
				"S201_VA_SF", //
				"", //
				"Apparent Power scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VAR(new PointImpl(//
				"S201_VAR", //
				"VAR", //
				"Reactive Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_A(new PointImpl(//
				"S201_V_A_RPH_A", //
				"VAR phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_B(new PointImpl(//
				"S201_V_A_RPH_B", //
				"VAR phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_C(new PointImpl(//
				"S201_V_A_RPH_C", //
				"VAR phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		VAR_SF(new PointImpl(//
				"S201_VAR_SF", //
				"", //
				"Reactive Power scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S201_PF", //
				"PF", //
				"Power Factor", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_A(new PointImpl(//
				"S201_P_FPH_A", //
				"PF phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_B(new PointImpl(//
				"S201_P_FPH_B", //
				"PF phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_C(new PointImpl(//
				"S201_P_FPH_C", //
				"PF phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		PF_SF(new PointImpl(//
				"S201_PF_SF", //
				"", //
				"Power Factor scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_WH_EXP(new PointImpl(//
				"S201_TOT_WH_EXP", //
				"Total Watt-hours Exported", //
				"Total Real Energy Exported", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_A(new PointImpl(//
				"S201_TOT_WH_EXP_PH_A", //
				"Total Watt-hours Exported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_B(new PointImpl(//
				"S201_TOT_WH_EXP_PH_B", //
				"Total Watt-hours Exported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_C(new PointImpl(//
				"S201_TOT_WH_EXP_PH_C", //
				"Total Watt-hours Exported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP(new PointImpl(//
				"S201_TOT_WH_IMP", //
				"Total Watt-hours Imported", //
				"Total Real Energy Imported", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_A(new PointImpl(//
				"S201_TOT_WH_IMP_PH_A", //
				"Total Watt-hours Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_B(new PointImpl(//
				"S201_TOT_WH_IMP_PH_B", //
				"Total Watt-hours Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_C(new PointImpl(//
				"S201_TOT_WH_IMP_PH_C", //
				"Total Watt-hours Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_S_F(new PointImpl(//
				"S201_TOT_WH_S_F", //
				"", //
				"Real Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP(new PointImpl(//
				"S201_TOT_V_AH_EXP", //
				"Total VA-hours Exported", //
				"Total Apparent Energy Exported", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_A(new PointImpl(//
				"S201_TOT_V_AH_EXP_PH_A", //
				"Total VA-hours Exported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_B(new PointImpl(//
				"S201_TOT_V_AH_EXP_PH_B", //
				"Total VA-hours Exported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_C(new PointImpl(//
				"S201_TOT_V_AH_EXP_PH_C", //
				"Total VA-hours Exported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP(new PointImpl(//
				"S201_TOT_V_AH_IMP", //
				"Total VA-hours Imported", //
				"Total Apparent Energy Imported", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_A(new PointImpl(//
				"S201_TOT_V_AH_IMP_PH_A", //
				"Total VA-hours Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_B(new PointImpl(//
				"S201_TOT_V_AH_IMP_PH_B", //
				"Total VA-hours Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_C(new PointImpl(//
				"S201_TOT_V_AH_IMP_PH_C", //
				"Total VA-hours Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_S_F(new PointImpl(//
				"S201_TOT_V_AH_S_F", //
				"", //
				"Apparent Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1(new PointImpl(//
				"S201_TOT_V_ARH_IMP_Q1", //
				"Total VAR-hours Imported Q1", //
				"Total Reactive Energy Imported Quadrant 1", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_A(new PointImpl(//
				"S201_TOT_V_ARH_IMP_Q1_PH_A", //
				"Total VAr-hours Imported Q1 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_B(new PointImpl(//
				"S201_TOT_V_ARH_IMP_Q1_PH_B", //
				"Total VAr-hours Imported Q1 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_C(new PointImpl(//
				"S201_TOT_V_ARH_IMP_Q1_PH_C", //
				"Total VAr-hourse Imported Q1 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2(new PointImpl(//
				"S201_TOT_V_ARH_IMP_Q2", //
				"Total VAr-hours Imported Q2", //
				"Total Reactive Power Imported Quadrant 2", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_A(new PointImpl(//
				"S201_TOT_V_ARH_IMP_Q2_PH_A", //
				"Total VAr-hours Imported Q2 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_B(new PointImpl(//
				"S201_TOT_V_ARH_IMP_Q2_PH_B", //
				"Total VAr-hours Imported Q2 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_C(new PointImpl(//
				"S201_TOT_V_ARH_IMP_Q2_PH_C", //
				"Total VAr-hours Imported Q2 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3(new PointImpl(//
				"S201_TOT_V_ARH_EXP_Q3", //
				"Total VAr-hours Exported Q3", //
				"Total Reactive Power Exported Quadrant 3", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_A(new PointImpl(//
				"S201_TOT_V_ARH_EXP_Q3_PH_A", //
				"Total VAr-hours Exported Q3 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_B(new PointImpl(//
				"S201_TOT_V_ARH_EXP_Q3_PH_B", //
				"Total VAr-hours Exported Q3 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_C(new PointImpl(//
				"S201_TOT_V_ARH_EXP_Q3_PH_C", //
				"Total VAr-hours Exported Q3 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4(new PointImpl(//
				"S201_TOT_V_ARH_EXP_Q4", //
				"Total VAr-hours Exported Q4", //
				"Total Reactive Power Exported Quadrant 4", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_A(new PointImpl(//
				"S201_TOT_V_ARH_EXP_Q4_PH_A", //
				"Total VAr-hours Exported Q4 Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_B(new PointImpl(//
				"S201_TOT_V_ARH_EXP_Q4_PH_B", //
				"", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_C(new PointImpl(//
				"S201_TOT_V_ARH_EXP_Q4_PH_C", //
				"Total VAr-hours Exported Q4 Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_S_F(new PointImpl(//
				"S201_TOT_V_ARH_S_F", //
				"", //
				"Reactive Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT(new PointImpl(//
				"S201_EVT", //
				"Events", //
				"Meter Event Flags", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S201_Evt.values())); //

		protected final PointImpl impl;

		private S201(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S201_Evt implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		POWER_FAILURE(2, "POWER_FAILURE"), //
		UNDER_VOLTAGE(3, "UNDER_VOLTAGE"), //
		LOW_P_F(4, "LOW_P_F"), //
		OVER_CURRENT(5, "OVER_CURRENT"), //
		OVER_VOLTAGE(6, "OVER_VOLTAGE"), //
		MISSING_SENSOR(7, "MISSING_SENSOR"), //
		OEM01(16, "OEM01"), //
		OEM02(17, "OEM02"), //
		OEM03(18, "OEM03"), //
		OEM04(19, "OEM04"), //
		OEM05(20, "OEM05"), //
		OEM06(21, "OEM06"), //
		OEM07(22, "OEM07"), //
		OEM08(23, "OEM08"), //
		OEM09(24, "OEM09"), //
		OEM10(25, "OEM10"), //
		OEM11(26, "OEM11"), //
		OEM12(27, "OEM12"), //
		OEM13(28, "OEM13"), //
		OEM14(29, "OEM14"), //
		OEM15(30, "OEM15"); //

		private final int value;
		private final String name;

		private S201_Evt(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S202 implements SunSpecPoint {
		A(new PointImpl(//
				"S202_A", //
				"Amps", //
				"Total AC Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S202_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S202_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S202_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S202_A_SF", //
				"", //
				"Current scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PH_V(new PointImpl(//
				"S202_PH_V", //
				"Voltage LN", //
				"Line to Neutral AC Voltage (average of active phases)", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S202_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S202_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S202_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PPV(new PointImpl(//
				"S202_PPV", //
				"Voltage LL", //
				"Line to Line AC Voltage (average of active phases)", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A_B(new PointImpl(//
				"S202_PH_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B_C(new PointImpl(//
				"S202_PH_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C_A(new PointImpl(//
				"S202_PH_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S202_V_SF", //
				"", //
				"Voltage scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S202_HZ", //
				"Hz", //
				"Frequency", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				"Hz_SF", //
				new OptionsEnum[0])), //
		HZ_S_F(new PointImpl(//
				"S202_HZ_S_F", //
				"", //
				"Frequency scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S202_W", //
				"Watts", //
				"Total Real Power", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_A(new PointImpl(//
				"S202_WPH_A", //
				"Watts phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_B(new PointImpl(//
				"S202_WPH_B", //
				"Watts phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_C(new PointImpl(//
				"S202_WPH_C", //
				"Watts phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		W_SF(new PointImpl(//
				"S202_W_SF", //
				"", //
				"Real Power scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S202_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_A(new PointImpl(//
				"S202_V_APH_A", //
				"VA phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_B(new PointImpl(//
				"S202_V_APH_B", //
				"VA phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_C(new PointImpl(//
				"S202_V_APH_C", //
				"VA phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		VA_SF(new PointImpl(//
				"S202_VA_SF", //
				"", //
				"Apparent Power scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VAR(new PointImpl(//
				"S202_VAR", //
				"VAR", //
				"Reactive Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_A(new PointImpl(//
				"S202_V_A_RPH_A", //
				"VAR phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_B(new PointImpl(//
				"S202_V_A_RPH_B", //
				"VAR phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_C(new PointImpl(//
				"S202_V_A_RPH_C", //
				"VAR phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		VAR_SF(new PointImpl(//
				"S202_VAR_SF", //
				"", //
				"Reactive Power scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S202_PF", //
				"PF", //
				"Power Factor", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_A(new PointImpl(//
				"S202_P_FPH_A", //
				"PF phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_B(new PointImpl(//
				"S202_P_FPH_B", //
				"PF phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_C(new PointImpl(//
				"S202_P_FPH_C", //
				"PF phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		PF_SF(new PointImpl(//
				"S202_PF_SF", //
				"", //
				"Power Factor scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_WH_EXP(new PointImpl(//
				"S202_TOT_WH_EXP", //
				"Total Watt-hours Exported", //
				"Total Real Energy Exported", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_A(new PointImpl(//
				"S202_TOT_WH_EXP_PH_A", //
				"Total Watt-hours Exported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_B(new PointImpl(//
				"S202_TOT_WH_EXP_PH_B", //
				"Total Watt-hours Exported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_C(new PointImpl(//
				"S202_TOT_WH_EXP_PH_C", //
				"Total Watt-hours Exported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP(new PointImpl(//
				"S202_TOT_WH_IMP", //
				"Total Watt-hours Imported", //
				"Total Real Energy Imported", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_A(new PointImpl(//
				"S202_TOT_WH_IMP_PH_A", //
				"Total Watt-hours Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_B(new PointImpl(//
				"S202_TOT_WH_IMP_PH_B", //
				"Total Watt-hours Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_C(new PointImpl(//
				"S202_TOT_WH_IMP_PH_C", //
				"Total Watt-hours Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_S_F(new PointImpl(//
				"S202_TOT_WH_S_F", //
				"", //
				"Real Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP(new PointImpl(//
				"S202_TOT_V_AH_EXP", //
				"Total VA-hours Exported", //
				"Total Apparent Energy Exported", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_A(new PointImpl(//
				"S202_TOT_V_AH_EXP_PH_A", //
				"Total VA-hours Exported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_B(new PointImpl(//
				"S202_TOT_V_AH_EXP_PH_B", //
				"Total VA-hours Exported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_C(new PointImpl(//
				"S202_TOT_V_AH_EXP_PH_C", //
				"Total VA-hours Exported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP(new PointImpl(//
				"S202_TOT_V_AH_IMP", //
				"Total VA-hours Imported", //
				"Total Apparent Energy Imported", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_A(new PointImpl(//
				"S202_TOT_V_AH_IMP_PH_A", //
				"Total VA-hours Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_B(new PointImpl(//
				"S202_TOT_V_AH_IMP_PH_B", //
				"Total VA-hours Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_C(new PointImpl(//
				"S202_TOT_V_AH_IMP_PH_C", //
				"Total VA-hours Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_S_F(new PointImpl(//
				"S202_TOT_V_AH_S_F", //
				"", //
				"Apparent Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1(new PointImpl(//
				"S202_TOT_V_ARH_IMP_Q1", //
				"Total VAR-hours Imported Q1", //
				"Total Reactive Energy Imported Quadrant 1", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_A(new PointImpl(//
				"S202_TOT_V_ARH_IMP_Q1_PH_A", //
				"Total VAr-hours Imported Q1 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_B(new PointImpl(//
				"S202_TOT_V_ARH_IMP_Q1_PH_B", //
				"Total VAr-hours Imported Q1 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_C(new PointImpl(//
				"S202_TOT_V_ARH_IMP_Q1_PH_C", //
				"Total VAr-hourse Imported Q1 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2(new PointImpl(//
				"S202_TOT_V_ARH_IMP_Q2", //
				"Total VAr-hours Imported Q2", //
				"Total Reactive Power Imported Quadrant 2", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_A(new PointImpl(//
				"S202_TOT_V_ARH_IMP_Q2_PH_A", //
				"Total VAr-hours Imported Q2 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_B(new PointImpl(//
				"S202_TOT_V_ARH_IMP_Q2_PH_B", //
				"Total VAr-hours Imported Q2 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_C(new PointImpl(//
				"S202_TOT_V_ARH_IMP_Q2_PH_C", //
				"Total VAr-hours Imported Q2 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3(new PointImpl(//
				"S202_TOT_V_ARH_EXP_Q3", //
				"Total VAr-hours Exported Q3", //
				"Total Reactive Power Exported Quadrant 3", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_A(new PointImpl(//
				"S202_TOT_V_ARH_EXP_Q3_PH_A", //
				"Total VAr-hours Exported Q3 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_B(new PointImpl(//
				"S202_TOT_V_ARH_EXP_Q3_PH_B", //
				"Total VAr-hours Exported Q3 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_C(new PointImpl(//
				"S202_TOT_V_ARH_EXP_Q3_PH_C", //
				"Total VAr-hours Exported Q3 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4(new PointImpl(//
				"S202_TOT_V_ARH_EXP_Q4", //
				"Total VAr-hours Exported Q4", //
				"Total Reactive Power Exported Quadrant 4", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_A(new PointImpl(//
				"S202_TOT_V_ARH_EXP_Q4_PH_A", //
				"Total VAr-hours Exported Q4 Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_B(new PointImpl(//
				"S202_TOT_V_ARH_EXP_Q4_PH_B", //
				"Total VAr-hours Exported Q4 Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_C(new PointImpl(//
				"S202_TOT_V_ARH_EXP_Q4_PH_C", //
				"Total VAr-hours Exported Q4 Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_S_F(new PointImpl(//
				"S202_TOT_V_ARH_S_F", //
				"", //
				"Reactive Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT(new PointImpl(//
				"S202_EVT", //
				"Events", //
				"Meter Event Flags", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S202_Evt.values())); //

		protected final PointImpl impl;

		private S202(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S202_Evt implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		POWER_FAILURE(2, "POWER_FAILURE"), //
		UNDER_VOLTAGE(3, "UNDER_VOLTAGE"), //
		LOW_P_F(4, "LOW_P_F"), //
		OVER_CURRENT(5, "OVER_CURRENT"), //
		OVER_VOLTAGE(6, "OVER_VOLTAGE"), //
		MISSING_SENSOR(7, "MISSING_SENSOR"), //
		RESERVED1(8, "RESERVED1"), //
		RESERVED2(9, "RESERVED2"), //
		RESERVED3(10, "RESERVED3"), //
		RESERVED4(11, "RESERVED4"), //
		RESERVED5(12, "RESERVED5"), //
		RESERVED6(13, "RESERVED6"), //
		RESERVED7(14, "RESERVED7"), //
		RESERVED8(15, "RESERVED8"), //
		OEM01(16, "OEM01"), //
		OEM02(17, "OEM02"), //
		OEM03(18, "OEM03"), //
		OEM04(19, "OEM04"), //
		OEM05(20, "OEM05"), //
		OEM06(21, "OEM06"), //
		OEM07(22, "OEM07"), //
		OEM08(23, "OEM08"), //
		OEM09(24, "OEM09"), //
		OEM10(25, "OEM10"), //
		OEM11(26, "OEM11"), //
		OEM12(27, "OEM12"), //
		OEM13(28, "OEM13"), //
		OEM14(29, "OEM14"), //
		OEM15(30, "OEM15"); //

		private final int value;
		private final String name;

		private S202_Evt(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S203 implements SunSpecPoint {
		A(new PointImpl(//
				"S203_A", //
				"Amps", //
				"Total AC Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S203_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S203_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S203_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S203_A_SF", //
				"", //
				"Current scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PH_V(new PointImpl(//
				"S203_PH_V", //
				"Voltage LN", //
				"Line to Neutral AC Voltage (average of active phases)", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S203_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S203_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S203_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PPV(new PointImpl(//
				"S203_PPV", //
				"Voltage LL", //
				"Line to Line AC Voltage (average of active phases)", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A_B(new PointImpl(//
				"S203_PH_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B_C(new PointImpl(//
				"S203_PH_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C_A(new PointImpl(//
				"S203_PH_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S203_V_SF", //
				"", //
				"Voltage scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S203_HZ", //
				"Hz", //
				"Frequency", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				"Hz_SF", //
				new OptionsEnum[0])), //
		HZ_S_F(new PointImpl(//
				"S203_HZ_S_F", //
				"", //
				"Frequency scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S203_W", //
				"Watts", //
				"Total Real Power", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_A(new PointImpl(//
				"S203_WPH_A", //
				"Watts phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_B(new PointImpl(//
				"S203_WPH_B", //
				"Watts phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_C(new PointImpl(//
				"S203_WPH_C", //
				"Watts phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		W_SF(new PointImpl(//
				"S203_W_SF", //
				"", //
				"Real Power scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S203_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_A(new PointImpl(//
				"S203_V_APH_A", //
				"VA phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_B(new PointImpl(//
				"S203_V_APH_B", //
				"VA phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_C(new PointImpl(//
				"S203_V_APH_C", //
				"VA phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		VA_SF(new PointImpl(//
				"S203_VA_SF", //
				"", //
				"Apparent Power scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VAR(new PointImpl(//
				"S203_VAR", //
				"VAR", //
				"Reactive Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_A(new PointImpl(//
				"S203_V_A_RPH_A", //
				"VAR phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_B(new PointImpl(//
				"S203_V_A_RPH_B", //
				"VAR phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_C(new PointImpl(//
				"S203_V_A_RPH_C", //
				"VAR phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		VAR_SF(new PointImpl(//
				"S203_VAR_SF", //
				"", //
				"Reactive Power scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S203_PF", //
				"PF", //
				"Power Factor", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_A(new PointImpl(//
				"S203_P_FPH_A", //
				"PF phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_B(new PointImpl(//
				"S203_P_FPH_B", //
				"PF phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_C(new PointImpl(//
				"S203_P_FPH_C", //
				"PF phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		PF_SF(new PointImpl(//
				"S203_PF_SF", //
				"", //
				"Power Factor scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_WH_EXP(new PointImpl(//
				"S203_TOT_WH_EXP", //
				"Total Watt-hours Exported", //
				"Total Real Energy Exported", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_A(new PointImpl(//
				"S203_TOT_WH_EXP_PH_A", //
				"Total Watt-hours Exported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_B(new PointImpl(//
				"S203_TOT_WH_EXP_PH_B", //
				"Total Watt-hours Exported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_C(new PointImpl(//
				"S203_TOT_WH_EXP_PH_C", //
				"Total Watt-hours Exported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP(new PointImpl(//
				"S203_TOT_WH_IMP", //
				"Total Watt-hours Imported", //
				"Total Real Energy Imported", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_A(new PointImpl(//
				"S203_TOT_WH_IMP_PH_A", //
				"Total Watt-hours Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_B(new PointImpl(//
				"S203_TOT_WH_IMP_PH_B", //
				"Total Watt-hours Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_C(new PointImpl(//
				"S203_TOT_WH_IMP_PH_C", //
				"Total Watt-hours Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_S_F(new PointImpl(//
				"S203_TOT_WH_S_F", //
				"", //
				"Real Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP(new PointImpl(//
				"S203_TOT_V_AH_EXP", //
				"Total VA-hours Exported", //
				"Total Apparent Energy Exported", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_A(new PointImpl(//
				"S203_TOT_V_AH_EXP_PH_A", //
				"Total VA-hours Exported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_B(new PointImpl(//
				"S203_TOT_V_AH_EXP_PH_B", //
				"Total VA-hours Exported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_C(new PointImpl(//
				"S203_TOT_V_AH_EXP_PH_C", //
				"Total VA-hours Exported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP(new PointImpl(//
				"S203_TOT_V_AH_IMP", //
				"Total VA-hours Imported", //
				"Total Apparent Energy Imported", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_A(new PointImpl(//
				"S203_TOT_V_AH_IMP_PH_A", //
				"Total VA-hours Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_B(new PointImpl(//
				"S203_TOT_V_AH_IMP_PH_B", //
				"Total VA-hours Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_C(new PointImpl(//
				"S203_TOT_V_AH_IMP_PH_C", //
				"Total VA-hours Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_S_F(new PointImpl(//
				"S203_TOT_V_AH_S_F", //
				"", //
				"Apparent Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1(new PointImpl(//
				"S203_TOT_V_ARH_IMP_Q1", //
				"Total VAR-hours Imported Q1", //
				"Total Reactive Energy Imported Quadrant 1", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_A(new PointImpl(//
				"S203_TOT_V_ARH_IMP_Q1_PH_A", //
				"Total VAr-hours Imported Q1 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_B(new PointImpl(//
				"S203_TOT_V_ARH_IMP_Q1_PH_B", //
				"Total VAr-hours Imported Q1 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_C(new PointImpl(//
				"S203_TOT_V_ARH_IMP_Q1_PH_C", //
				"Total VAr-hourse Imported Q1 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2(new PointImpl(//
				"S203_TOT_V_ARH_IMP_Q2", //
				"Total VAr-hours Imported Q2", //
				"Total Reactive Power Imported Quadrant 2", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_A(new PointImpl(//
				"S203_TOT_V_ARH_IMP_Q2_PH_A", //
				"Total VAr-hours Imported Q2 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_B(new PointImpl(//
				"S203_TOT_V_ARH_IMP_Q2_PH_B", //
				"Total VAr-hours Imported Q2 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_C(new PointImpl(//
				"S203_TOT_V_ARH_IMP_Q2_PH_C", //
				"Total VAr-hours Imported Q2 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3(new PointImpl(//
				"S203_TOT_V_ARH_EXP_Q3", //
				"Total VAr-hours Exported Q3", //
				"Total Reactive Power Exported Quadrant 3", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_A(new PointImpl(//
				"S203_TOT_V_ARH_EXP_Q3_PH_A", //
				"Total VAr-hours Exported Q3 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_B(new PointImpl(//
				"S203_TOT_V_ARH_EXP_Q3_PH_B", //
				"Total VAr-hours Exported Q3 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_C(new PointImpl(//
				"S203_TOT_V_ARH_EXP_Q3_PH_C", //
				"Total VAr-hours Exported Q3 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4(new PointImpl(//
				"S203_TOT_V_ARH_EXP_Q4", //
				"Total VAr-hours Exported Q4", //
				"Total Reactive Power Exported Quadrant 4", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_A(new PointImpl(//
				"S203_TOT_V_ARH_EXP_Q4_PH_A", //
				"Total VAr-hours Exported Q4 Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_B(new PointImpl(//
				"S203_TOT_V_ARH_EXP_Q4_PH_B", //
				"", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_C(new PointImpl(//
				"S203_TOT_V_ARH_EXP_Q4_PH_C", //
				"Total VAr-hours Exported Q4 Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_S_F(new PointImpl(//
				"S203_TOT_V_ARH_S_F", //
				"", //
				"Reactive Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT(new PointImpl(//
				"S203_EVT", //
				"Events", //
				"Meter Event Flags", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S203_Evt.values())); //

		protected final PointImpl impl;

		private S203(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S203_Evt implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		POWER_FAILURE(2, "POWER_FAILURE"), //
		UNDER_VOLTAGE(3, "UNDER_VOLTAGE"), //
		LOW_P_F(4, "LOW_P_F"), //
		OVER_CURRENT(5, "OVER_CURRENT"), //
		OVER_VOLTAGE(6, "OVER_VOLTAGE"), //
		MISSING_SENSOR(7, "MISSING_SENSOR"), //
		RESERVED1(8, "RESERVED1"), //
		RESERVED2(9, "RESERVED2"), //
		RESERVED3(10, "RESERVED3"), //
		RESERVED4(11, "RESERVED4"), //
		RESERVED5(12, "RESERVED5"), //
		RESERVED6(13, "RESERVED6"), //
		RESERVED7(14, "RESERVED7"), //
		RESERVED8(15, "RESERVED8"), //
		OEM01(16, "OEM01"), //
		OEM02(17, "OEM02"), //
		OEM03(18, "OEM03"), //
		OEM04(19, "OEM04"), //
		OEM05(20, "OEM05"), //
		OEM06(21, "OEM06"), //
		OEM07(22, "OEM07"), //
		OEM08(23, "OEM08"), //
		OEM09(24, "OEM09"), //
		OEM10(25, "OEM10"), //
		OEM11(26, "OEM11"), //
		OEM12(27, "OEM12"), //
		OEM13(28, "OEM13"), //
		OEM14(29, "OEM14"), //
		OEM15(30, "OEM15"); //

		private final int value;
		private final String name;

		private S203_Evt(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S204 implements SunSpecPoint {
		A(new PointImpl(//
				"S204_A", //
				"Amps", //
				"Total AC Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_A(new PointImpl(//
				"S204_APH_A", //
				"Amps PhaseA", //
				"Phase A Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_B(new PointImpl(//
				"S204_APH_B", //
				"Amps PhaseB", //
				"Phase B Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		APH_C(new PointImpl(//
				"S204_APH_C", //
				"Amps PhaseC", //
				"Phase C Current", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S204_A_SF", //
				"", //
				"Current scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PH_V(new PointImpl(//
				"S204_PH_V", //
				"Voltage LN", //
				"Line to Neutral AC Voltage (average of active phases)", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A(new PointImpl(//
				"S204_PH_VPH_A", //
				"Phase Voltage AN", //
				"Phase Voltage AN", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B(new PointImpl(//
				"S204_PH_VPH_B", //
				"Phase Voltage BN", //
				"Phase Voltage BN", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C(new PointImpl(//
				"S204_PH_VPH_C", //
				"Phase Voltage CN", //
				"Phase Voltage CN", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PPV(new PointImpl(//
				"S204_PPV", //
				"Voltage LL", //
				"Line to Line AC Voltage (average of active phases)", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_A_B(new PointImpl(//
				"S204_PH_VPH_A_B", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_B_C(new PointImpl(//
				"S204_PH_VPH_B_C", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		PH_VPH_C_A(new PointImpl(//
				"S204_PH_VPH_C_A", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S204_V_SF", //
				"", //
				"Voltage scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		HZ(new PointImpl(//
				"S204_HZ", //
				"Hz", //
				"Frequency", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.HERTZ, //
				"Hz_SF", //
				new OptionsEnum[0])), //
		HZ_S_F(new PointImpl(//
				"S204_HZ_S_F", //
				"", //
				"Frequency scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S204_W", //
				"Watts", //
				"Total Real Power", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_A(new PointImpl(//
				"S204_WPH_A", //
				"Watts phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_B(new PointImpl(//
				"S204_WPH_B", //
				"Watts phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		WPH_C(new PointImpl(//
				"S204_WPH_C", //
				"Watts phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		W_SF(new PointImpl(//
				"S204_W_SF", //
				"", //
				"Real Power scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VA(new PointImpl(//
				"S204_VA", //
				"VA", //
				"AC Apparent Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_A(new PointImpl(//
				"S204_V_APH_A", //
				"VA phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_B(new PointImpl(//
				"S204_V_APH_B", //
				"VA phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		V_APH_C(new PointImpl(//
				"S204_V_APH_C", //
				"VA phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE, //
				"VA_SF", //
				new OptionsEnum[0])), //
		VA_SF(new PointImpl(//
				"S204_VA_SF", //
				"", //
				"Apparent Power scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		VAR(new PointImpl(//
				"S204_VAR", //
				"VAR", //
				"Reactive Power", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_A(new PointImpl(//
				"S204_V_A_RPH_A", //
				"VAR phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_B(new PointImpl(//
				"S204_V_A_RPH_B", //
				"VAR phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		V_A_RPH_C(new PointImpl(//
				"S204_V_A_RPH_C", //
				"VAR phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE, //
				"VAR_SF", //
				new OptionsEnum[0])), //
		VAR_SF(new PointImpl(//
				"S204_VAR_SF", //
				"", //
				"Reactive Power scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PF(new PointImpl(//
				"S204_PF", //
				"PF", //
				"Power Factor", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_A(new PointImpl(//
				"S204_P_FPH_A", //
				"PF phase A", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_B(new PointImpl(//
				"S204_P_FPH_B", //
				"PF phase B", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		P_FPH_C(new PointImpl(//
				"S204_P_FPH_C", //
				"PF phase C", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"PF_SF", //
				new OptionsEnum[0])), //
		PF_SF(new PointImpl(//
				"S204_PF_SF", //
				"", //
				"Power Factor scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_WH_EXP(new PointImpl(//
				"S204_TOT_WH_EXP", //
				"Total Watt-hours Exported", //
				"Total Real Energy Exported", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_A(new PointImpl(//
				"S204_TOT_WH_EXP_PH_A", //
				"Total Watt-hours Exported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_B(new PointImpl(//
				"S204_TOT_WH_EXP_PH_B", //
				"Total Watt-hours Exported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_EXP_PH_C(new PointImpl(//
				"S204_TOT_WH_EXP_PH_C", //
				"Total Watt-hours Exported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP(new PointImpl(//
				"S204_TOT_WH_IMP", //
				"Total Watt-hours Imported", //
				"Total Real Energy Imported", //
				"", //
				PointType.ACC32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_A(new PointImpl(//
				"S204_TOT_WH_IMP_PH_A", //
				"Total Watt-hours Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_B(new PointImpl(//
				"S204_TOT_WH_IMP_PH_B", //
				"Total Watt-hours Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_IMP_PH_C(new PointImpl(//
				"S204_TOT_WH_IMP_PH_C", //
				"Total Watt-hours Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"TotWh_SF", //
				new OptionsEnum[0])), //
		TOT_WH_S_F(new PointImpl(//
				"S204_TOT_WH_S_F", //
				"", //
				"Real Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP(new PointImpl(//
				"S204_TOT_V_AH_EXP", //
				"Total VA-hours Exported", //
				"Total Apparent Energy Exported", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_A(new PointImpl(//
				"S204_TOT_V_AH_EXP_PH_A", //
				"Total VA-hours Exported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_B(new PointImpl(//
				"S204_TOT_V_AH_EXP_PH_B", //
				"Total VA-hours Exported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_EXP_PH_C(new PointImpl(//
				"S204_TOT_V_AH_EXP_PH_C", //
				"Total VA-hours Exported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP(new PointImpl(//
				"S204_TOT_V_AH_IMP", //
				"Total VA-hours Imported", //
				"Total Apparent Energy Imported", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_A(new PointImpl(//
				"S204_TOT_V_AH_IMP_PH_A", //
				"Total VA-hours Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_B(new PointImpl(//
				"S204_TOT_V_AH_IMP_PH_B", //
				"Total VA-hours Imported phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_IMP_PH_C(new PointImpl(//
				"S204_TOT_V_AH_IMP_PH_C", //
				"Total VA-hours Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_HOURS, //
				"TotVAh_SF", //
				new OptionsEnum[0])), //
		TOT_V_AH_S_F(new PointImpl(//
				"S204_TOT_V_AH_S_F", //
				"", //
				"Apparent Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1(new PointImpl(//
				"S204_TOT_V_ARH_IMP_Q1", //
				"Total VAR-hours Imported Q1", //
				"Total Reactive Energy Imported Quadrant 1", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_A(new PointImpl(//
				"S204_TOT_V_ARH_IMP_Q1_PH_A", //
				"Total VAr-hours Imported Q1 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_B(new PointImpl(//
				"S204_TOT_V_ARH_IMP_Q1_PH_B", //
				"Total VAr-hours Imported Q1 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q1_PH_C(new PointImpl(//
				"S204_TOT_V_ARH_IMP_Q1_PH_C", //
				"Total VAr-hourse Imported Q1 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2(new PointImpl(//
				"S204_TOT_V_ARH_IMP_Q2", //
				"Total VAr-hours Imported Q2", //
				"Total Reactive Power Imported Quadrant 2", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_A(new PointImpl(//
				"S204_TOT_V_ARH_IMP_Q2_PH_A", //
				"Total VAr-hours Imported Q2 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_B(new PointImpl(//
				"S204_TOT_V_ARH_IMP_Q2_PH_B", //
				"Total VAr-hours Imported Q2 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_IMP_Q2_PH_C(new PointImpl(//
				"S204_TOT_V_ARH_IMP_Q2_PH_C", //
				"Total VAr-hours Imported Q2 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3(new PointImpl(//
				"S204_TOT_V_ARH_EXP_Q3", //
				"Total VAr-hours Exported Q3", //
				"Total Reactive Power Exported Quadrant 3", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_A(new PointImpl(//
				"S204_TOT_V_ARH_EXP_Q3_PH_A", //
				"Total VAr-hours Exported Q3 phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_B(new PointImpl(//
				"S204_TOT_V_ARH_EXP_Q3_PH_B", //
				"Total VAr-hours Exported Q3 phase B", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q3_PH_C(new PointImpl(//
				"S204_TOT_V_ARH_EXP_Q3_PH_C", //
				"Total VAr-hours Exported Q3 phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4(new PointImpl(//
				"S204_TOT_V_ARH_EXP_Q4", //
				"Total VAr-hours Exported Q4", //
				"Total Reactive Power Exported Quadrant 4", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_A(new PointImpl(//
				"S204_TOT_V_ARH_EXP_Q4_PH_A", //
				"Total VAr-hours Exported Q4 Imported phase A", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_B(new PointImpl(//
				"S204_TOT_V_ARH_EXP_Q4_PH_B", //
				"", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_EXP_Q4_PH_C(new PointImpl(//
				"S204_TOT_V_ARH_EXP_Q4_PH_C", //
				"Total VAr-hours Exported Q4 Imported phase C", //
				"", //
				"", //
				PointType.ACC32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT_AMPERE_REACTIVE_HOURS, //
				"TotVArh_SF", //
				new OptionsEnum[0])), //
		TOT_V_ARH_S_F(new PointImpl(//
				"S204_TOT_V_ARH_S_F", //
				"", //
				"Reactive Energy scale factor", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT(new PointImpl(//
				"S204_EVT", //
				"Events", //
				"Meter Event Flags", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S204_Evt.values())); //

		protected final PointImpl impl;

		private S204(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S204_Evt implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		POWER_FAILURE(2, "POWER_FAILURE"), //
		UNDER_VOLTAGE(3, "UNDER_VOLTAGE"), //
		LOW_P_F(4, "LOW_P_F"), //
		OVER_CURRENT(5, "OVER_CURRENT"), //
		OVER_VOLTAGE(6, "OVER_VOLTAGE"), //
		MISSING_SENSOR(7, "MISSING_SENSOR"), //
		RESERVED1(8, "RESERVED1"), //
		RESERVED2(9, "RESERVED2"), //
		RESERVED3(10, "RESERVED3"), //
		RESERVED4(11, "RESERVED4"), //
		RESERVED5(12, "RESERVED5"), //
		RESERVED6(13, "RESERVED6"), //
		RESERVED7(14, "RESERVED7"), //
		RESERVED8(15, "RESERVED8"), //
		OEM01(16, "OEM01"), //
		OEM02(17, "OEM02"), //
		OEM03(18, "OEM03"), //
		OEM04(19, "OEM04"), //
		OEM05(20, "OEM05"), //
		OEM06(21, "OEM06"), //
		OEM07(22, "OEM07"), //
		OEM08(23, "OEM08"), //
		OEM09(24, "OEM09"), //
		OEM10(25, "OEM10"), //
		OEM11(26, "OEM11"), //
		OEM12(27, "OEM12"), //
		OEM13(28, "OEM13"), //
		OEM14(29, "OEM14"), //
		OEM15(30, "OEM15"); //

		private final int value;
		private final String name;

		private S204_Evt(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S302 implements SunSpecPoint {
		GHI(new PointImpl(//
				"S302_GHI", //
				"GHI", //
				"Global Horizontal Irradiance", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		POAI(new PointImpl(//
				"S302_POAI", //
				"POAI", //
				"Plane-of-Array Irradiance", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DFI(new PointImpl(//
				"S302_DFI", //
				"DFI", //
				"Diffuse Irradiance", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DNI(new PointImpl(//
				"S302_DNI", //
				"DNI", //
				"Direct Normal Irradiance", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		OTI(new PointImpl(//
				"S302_OTI", //
				"OTI", //
				"Other Irradiance", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S302(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S303 implements SunSpecPoint {
		TMP_B_O_M(new PointImpl(//
				"S303_TMP_B_O_M", //
				"Temp", //
				"Back of module temperature measurement", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"-1", //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S303(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S304 implements SunSpecPoint {
		INCLX(new PointImpl(//
				"S304_INCLX", //
				"X", //
				"X-Axis inclination", //
				"", //
				PointType.INT32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"-2", //
				new OptionsEnum[0])), //
		INCLY(new PointImpl(//
				"S304_INCLY", //
				"Y", //
				"Y-Axis inclination", //
				"", //
				PointType.INT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"-2", //
				new OptionsEnum[0])), //
		INCLZ(new PointImpl(//
				"S304_INCLZ", //
				"Z", //
				"Z-Axis inclination", //
				"", //
				PointType.INT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"-2", //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S304(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S305 implements SunSpecPoint {
		TM(new PointImpl(//
				"S305_TM", //
				"Tm", //
				"UTC 24 hour time stamp to millisecond hhmmss.sssZ format", //
				"", //
				PointType.STRING6, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DATE(new PointImpl(//
				"S305_DATE", //
				"Date", //
				"UTC Date string YYYYMMDD format", //
				"", //
				PointType.STRING4, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		LOC(new PointImpl(//
				"S305_LOC", //
				"Location", //
				"Location string (40 chars max)", //
				"", //
				PointType.STRING20, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		LAT(new PointImpl(//
				"S305_LAT", //
				"Lat", //
				"Lattitude with seven degrees of precision", //
				"", //
				PointType.INT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"-7", //
				new OptionsEnum[0])), //
		LONG(new PointImpl(//
				"S305_LONG", //
				"Long", //
				"Longitude with seven degrees of precision", //
				"", //
				PointType.INT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"-7", //
				new OptionsEnum[0])), //
		ALT(new PointImpl(//
				"S305_ALT", //
				"Altitude", //
				"Altitude measurement in meters", //
				"", //
				PointType.INT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S305(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S306 implements SunSpecPoint {
		GHI(new PointImpl(//
				"S306_GHI", //
				"GHI", //
				"Global Horizontal Irrandiance", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		A(new PointImpl(//
				"S306_A", //
				"Amps", //
				"Current measurment at reference point", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V(new PointImpl(//
				"S306_V", //
				"Voltage", //
				"Voltage  measurment at reference point", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TMP(new PointImpl(//
				"S306_TMP", //
				"Temperature", //
				"Temperature measurment at reference point", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S306(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S307 implements SunSpecPoint {
		TMP_AMB(new PointImpl(//
				"S307_TMP_AMB", //
				"Ambient Temperature", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"-1", //
				new OptionsEnum[0])), //
		RH(new PointImpl(//
				"S307_RH", //
				"Relative Humidity", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PRES(new PointImpl(//
				"S307_PRES", //
				"Barometric Pressure", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WND_SPD(new PointImpl(//
				"S307_WND_SPD", //
				"Wind Speed", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WND_DIR(new PointImpl(//
				"S307_WND_DIR", //
				"Wind Direction", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		RAIN(new PointImpl(//
				"S307_RAIN", //
				"Rainfall", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		SNW(new PointImpl(//
				"S307_SNW", //
				"Snow Depth", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PPT(new PointImpl(//
				"S307_PPT", //
				"Precipitation Type", //
				"Precipitation Type (WMO 4680 SYNOP code reference)", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ELEC_FLD(new PointImpl(//
				"S307_ELEC_FLD", //
				"Electric Field", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		SUR_WET(new PointImpl(//
				"S307_SUR_WET", //
				"Surface Wetness", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		SOIL_WET(new PointImpl(//
				"S307_SOIL_WET", //
				"Soil Wetness", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S307(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S308 implements SunSpecPoint {
		GHI(new PointImpl(//
				"S308_GHI", //
				"GHI", //
				"Global Horizontal Irradiance", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TMP_B_O_M(new PointImpl(//
				"S308_TMP_B_O_M", //
				"Temp", //
				"Back of module temperature measurement", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"-1", //
				new OptionsEnum[0])), //
		TMP_AMB(new PointImpl(//
				"S308_TMP_AMB", //
				"Ambient Temperature", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"-1", //
				new OptionsEnum[0])), //
		WND_SPD(new PointImpl(//
				"S308_WND_SPD", //
				"Wind Speed", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S308(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S801 implements SunSpecPoint {
		DEPRECATED(new PointImpl(//
				"S801_DEPRECATED", //
				"Deprecated Model", //
				"This model has been deprecated.", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S801(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S802 implements SunSpecPoint {
		A_H_RTG(new PointImpl(//
				"S802_A_H_RTG", //
				"Nameplate Charge Capacity", //
				"Nameplate charge capacity in amp-hours.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE_HOURS, //
				"AHRtg_SF", //
				new OptionsEnum[0])), //
		W_H_RTG(new PointImpl(//
				"S802_W_H_RTG", //
				"Nameplate Energy Capacity", //
				"Nameplate energy capacity in DC watt-hours.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT_HOURS, //
				"WHRtg_SF", //
				new OptionsEnum[0])), //
		W_CHA_RTE_MAX(new PointImpl(//
				"S802_W_CHA_RTE_MAX", //
				"Nameplate Max Charge Rate", //
				"Maximum rate of energy transfer into the storage device in DC watts.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"WChaDisChaMax_SF", //
				new OptionsEnum[0])), //
		W_DIS_CHA_RTE_MAX(new PointImpl(//
				"S802_W_DIS_CHA_RTE_MAX", //
				"Namplate Max Discharge Rate", //
				"Maximum rate of energy transfer out of the storage device in DC watts.", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"WChaDisChaMax_SF", //
				new OptionsEnum[0])), //
		DIS_CHA_RTE(new PointImpl(//
				"S802_DIS_CHA_RTE", //
				"Self Discharge Rate", //
				"Self discharge rate.  Percentage of capacity (WHRtg) discharged per day.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.PERCENT, //
				"DisChaRte_SF", //
				new OptionsEnum[0])), //
		SO_C_MAX(new PointImpl(//
				"S802_SO_C_MAX", //
				"Nameplate Max SoC", //
				"Manufacturer maximum state of charge, expressed as a percentage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.PERCENT, //
				"SoC_SF", //
				new OptionsEnum[0])), //
		SO_C_MIN(new PointImpl(//
				"S802_SO_C_MIN", //
				"Nameplate Min SoC", //
				"Manufacturer minimum state of charge, expressed as a percentage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.PERCENT, //
				"SoC_SF", //
				new OptionsEnum[0])), //
		SOC_RSV_MAX(new PointImpl(//
				"S802_SOC_RSV_MAX", //
				"Max Reserve Percent", //
				"Setpoint for maximum reserve for storage as a percentage of the nominal maximum storage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"SoC_SF", //
				new OptionsEnum[0])), //
		SO_C_RSV_MIN(new PointImpl(//
				"S802_SO_C_RSV_MIN", //
				"Min Reserve Percent", //
				"Setpoint for maximum reserve for storage as a percentage of the nominal maximum storage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.PERCENT, //
				"SoC_SF", //
				new OptionsEnum[0])), //
		SO_C(new PointImpl(//
				"S802_SO_C", //
				"State of Charge", //
				"State of charge, expressed as a percentage.", //
				"Measurement.", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.PERCENT, //
				"SoC_SF", //
				new OptionsEnum[0])), //
		DO_D(new PointImpl(//
				"S802_DO_D", //
				"Depth of Discharge", //
				"Depth of discharge, expressed as a percentage.", //
				"Measurement.", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.PERCENT, //
				"DoD_SF", //
				new OptionsEnum[0])), //
		SO_H(new PointImpl(//
				"S802_SO_H", //
				"State of Health", //
				"Percentage of battery life remaining.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.PERCENT, //
				"SoH_SF", //
				new OptionsEnum[0])), //
		N_CYC(new PointImpl(//
				"S802_N_CYC", //
				"Cycle Count", //
				"Number of cycles executed in the battery.", //
				"", //
				PointType.UINT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CHA_ST(new PointImpl(//
				"S802_CHA_ST", //
				"Charge Status", //
				"Charge status of storage device. Enumeration.", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S802_ChaSt.values())), //
		LOC_REM_CTL(new PointImpl(//
				"S802_LOC_REM_CTL", //
				"Control Mode", //
				"Battery control mode. Enumeration.", //
				"Maps to DRCC.LocRemCtl in IEC 61850.", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S802_LocRemCtl.values())), //
		HB(new PointImpl(//
				"S802_HB", //
				"Battery Heartbeat", //
				"Value is incremented every second with periodic resets to zero.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CTRL_HB(new PointImpl(//
				"S802_CTRL_HB", //
				"Controller Heartbeat", //
				"Value is incremented every second with periodic resets to zero.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ALM_RST(new PointImpl(//
				"S802_ALM_RST", //
				"Alarm Reset", //
				"Used to reset any latched alarms.  1 = Reset.", //
				"Battery should reset to 0 when reset is complete.", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TYP(new PointImpl(//
				"S802_TYP", //
				"Battery Type", //
				"Type of battery. Enumeration.", //
				"Maps to DBAT.BatTyp in 61850.", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S802_Typ.values())), //
		STATE(new PointImpl(//
				"S802_STATE", //
				"State of the Battery Bank", //
				"State of the battery bank.  Enumeration.", //
				"Must be reconciled with State in IEC 61850.", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S802_State.values())), //
		STATE_VND(new PointImpl(//
				"S802_STATE_VND", //
				"Vendor Battery Bank State", //
				"Vendor specific battery bank state.  Enumeration.", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WARR_DT(new PointImpl(//
				"S802_WARR_DT", //
				"Warranty Date", //
				"Date the device warranty expires.", //
				"Number of days since 1/1/2000.", //
				PointType.UINT32, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT1(new PointImpl(//
				"S802_EVT1", //
				"Battery Event 1 Bitfield", //
				"Alarms and warnings.  Bit flags.", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S802_Evt1.values())), //
		EVT2(new PointImpl(//
				"S802_EVT2", //
				"Battery Event 2 Bitfield", //
				"Alarms and warnings.  Bit flags.", //
				"Reserved for future use.", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND1(new PointImpl(//
				"S802_EVT_VND1", //
				"Vendor Event Bitfield 1", //
				"Vendor defined events.", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		EVT_VND2(new PointImpl(//
				"S802_EVT_VND2", //
				"Vendor Event Bitfield 2", //
				"Vendor defined events.", //
				"", //
				PointType.BITFIELD32, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V(new PointImpl(//
				"S802_V", //
				"External Battery Voltage", //
				"DC Bus Voltage.", //
				"Maps to ZBAT.V in IEC 61850.", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_MAX(new PointImpl(//
				"S802_V_MAX", //
				"Max Battery Voltage", //
				"Instantaneous maximum battery voltage.", //
				"If not implemented, must implement AChaMax and ADisChaMax.", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		V_MIN(new PointImpl(//
				"S802_V_MIN", //
				"Min Battery Voltage", //
				"Instantaneous minimum battery voltage.", //
				"If not implemented, must implement AChaMax and ADisChaMax.", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		CELL_V_MAX(new PointImpl(//
				"S802_CELL_V_MAX", //
				"Max Cell Voltage", //
				"Maximum voltage for all cells in the bank.", //
				"Measurement.", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"CellV_SF", //
				new OptionsEnum[0])), //
		CELL_V_MAX_STR(new PointImpl(//
				"S802_CELL_V_MAX_STR", //
				"Max Cell Voltage String", //
				"String containing the cell with maximum voltage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CELL_V_MAX_MOD(new PointImpl(//
				"S802_CELL_V_MAX_MOD", //
				"Max Cell Voltage Module", //
				"Module containing the cell with maximum voltage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CELL_V_MIN(new PointImpl(//
				"S802_CELL_V_MIN", //
				"Min Cell Voltage", //
				"Minimum voltage for all cells in the bank.", //
				"Measurement.", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"CellV_SF", //
				new OptionsEnum[0])), //
		CELL_V_MIN_STR(new PointImpl(//
				"S802_CELL_V_MIN_STR", //
				"Min Cell Voltage String", //
				"String containing the cell with minimum voltage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CELL_V_MIN_MOD(new PointImpl(//
				"S802_CELL_V_MIN_MOD", //
				"Min Cell Voltage Module", //
				"Module containing the cell with minimum voltage.", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CELL_V_AVG(new PointImpl(//
				"S802_CELL_V_AVG", //
				"Average Cell Voltage", //
				"Average cell voltage for all cells in the bank.", //
				"Calculation based on measurements.", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"CellV_SF", //
				new OptionsEnum[0])), //
		A(new PointImpl(//
				"S802_A", //
				"Total DC Current", //
				"Total DC current flowing to/from the battery bank.", //
				"Measurement.", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		A_CHA_MAX(new PointImpl(//
				"S802_A_CHA_MAX", //
				"Max Charge Current", //
				"Instantaneous maximum DC charge current.", //
				"Calculation which is always unsigned (i.e. magnitude only). If not implemented, must implement VMax and VMin.", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"AMax_SF", //
				new OptionsEnum[0])), //
		A_DIS_CHA_MAX(new PointImpl(//
				"S802_A_DIS_CHA_MAX", //
				"Max Discharge Current", //
				"Instantaneous maximum DC discharge current.", //
				"Calculation which is always unsigned (i.e. magnitude only). If not implemented, must implement VMax and VMin.", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"AMax_SF", //
				new OptionsEnum[0])), //
		W(new PointImpl(//
				"S802_W", //
				"Total Power", //
				"Total power flowing to/from the battery bank.", //
				"Measurement.", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		REQ_INV_STATE(new PointImpl(//
				"S802_REQ_INV_STATE", //
				"Inverter State Request", //
				"Request from battery to start or stop the inverter.  Enumeration.", //
				"Used in special states such as manual battery charging.", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S802_ReqInvState.values())), //
		REQ_W(new PointImpl(//
				"S802_REQ_W", //
				"Battery Power Request", //
				"AC Power requested by battery.", //
				"Used in special states such as string balancing.", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"W_SF", //
				new OptionsEnum[0])), //
		SET_OP(new PointImpl(//
				"S802_SET_OP", //
				"Set Operation", //
				"Instruct the battery bank to perform an operation such as connecting.  Enumeration.", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S802_SetOp.values())), //
		SET_INV_STATE(new PointImpl(//
				"S802_SET_INV_STATE", //
				"Set Inverter State", //
				"Set the current state of the inverter.", //
				"Information needed by battery for some operations.", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				S802_SetInvState.values())), //
		A_H_RTG_S_F(new PointImpl(//
				"S802_A_H_RTG_S_F", //
				"", //
				"Scale factor for charge capacity.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W_H_RTG_S_F(new PointImpl(//
				"S802_W_H_RTG_S_F", //
				"", //
				"Scale factor for energy capacity.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W_CHA_DIS_CHA_MAX_S_F(new PointImpl(//
				"S802_W_CHA_DIS_CHA_MAX_S_F", //
				"", //
				"Scale factor for maximum charge and discharge rate.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DIS_CHA_RTE_S_F(new PointImpl(//
				"S802_DIS_CHA_RTE_S_F", //
				"", //
				"Scale factor for self discharge rate.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		SO_C_S_F(new PointImpl(//
				"S802_SO_C_S_F", //
				"", //
				"Scale factor for state of charge values.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DO_D_S_F(new PointImpl(//
				"S802_DO_D_S_F", //
				"", //
				"Scale factor for depth of discharge.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		SO_H_S_F(new PointImpl(//
				"S802_SO_H_S_F", //
				"", //
				"Scale factor for state of health.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S802_V_SF", //
				"", //
				"Scale factor for DC bus voltage.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CELL_V_S_F(new PointImpl(//
				"S802_CELL_V_S_F", //
				"", //
				"Scale factor for cell voltage.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S802_A_SF", //
				"", //
				"Scale factor for DC current.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		A_MAX_S_F(new PointImpl(//
				"S802_A_MAX_S_F", //
				"", //
				"Scale factor for instantationous DC charge/discharge current.", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		W_SF(new PointImpl(//
				"S802_W_SF", //
				"", //
				"Scale factor for AC power request.", //
				"", //
				PointType.SUNSSF, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S802(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S802_ChaSt implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(1, "OFF"), //
		EMPTY(2, "EMPTY"), //
		DISCHARGING(3, "DISCHARGING"), //
		CHARGING(4, "CHARGING"), //
		FULL(5, "FULL"), //
		HOLDING(6, "HOLDING"), //
		TESTING(7, "TESTING"); //

		private final int value;
		private final String name;

		private S802_ChaSt(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S802_LocRemCtl implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		REMOTE(0, "REMOTE"), //
		LOCAL(1, "LOCAL"); //

		private final int value;
		private final String name;

		private S802_LocRemCtl(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S802_Typ implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		NOT_APPLICABLE_UNKNOWN(0, "NOT_APPLICABLE_UNKNOWN"), //
		LEAD_ACID(1, "LEAD_ACID"), //
		NICKEL_METAL_HYDRATE(2, "NICKEL_METAL_HYDRATE"), //
		NICKEL_CADMIUM(3, "NICKEL_CADMIUM"), //
		LITHIUM_ION(4, "LITHIUM_ION"), //
		CARBON_ZINC(5, "CARBON_ZINC"), //
		ZINC_CHLORIDE(6, "ZINC_CHLORIDE"), //
		ALKALINE(7, "ALKALINE"), //
		RECHARGEABLE_ALKALINE(8, "RECHARGEABLE_ALKALINE"), //
		SODIUM_SULFUR(9, "SODIUM_SULFUR"), //
		FLOW(10, "FLOW"), //
		OTHER(99, "OTHER"); //

		private final int value;
		private final String name;

		private S802_Typ(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S802_State implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		DISCONNECTED(1, "DISCONNECTED"), //
		INITIALIZING(2, "INITIALIZING"), //
		CONNECTED(3, "CONNECTED"), //
		STANDBY(4, "STANDBY"), //
		SOC_PROTECTION(5, "SOC_PROTECTION"), //
		SUSPENDING(6, "SUSPENDING"), //
		FAULT(99, "FAULT"); //

		private final int value;
		private final String name;

		private S802_State(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S802_Evt1 implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		COMMUNICATION_ERROR(0, "COMMUNICATION_ERROR"), //
		OVER_TEMP_ALARM(1, "OVER_TEMP_ALARM"), //
		OVER_TEMP_WARNING(2, "OVER_TEMP_WARNING"), //
		UNDER_TEMP_ALARM(3, "UNDER_TEMP_ALARM"), //
		UNDER_TEMP_WARNING(4, "UNDER_TEMP_WARNING"), //
		OVER_CHARGE_CURRENT_ALARM(5, "OVER_CHARGE_CURRENT_ALARM"), //
		OVER_CHARGE_CURRENT_WARNING(6, "OVER_CHARGE_CURRENT_WARNING"), //
		OVER_DISCHARGE_CURRENT_ALARM(7, "OVER_DISCHARGE_CURRENT_ALARM"), //
		OVER_DISCHARGE_CURRENT_WARNING(8, "OVER_DISCHARGE_CURRENT_WARNING"), //
		OVER_VOLT_ALARM(9, "OVER_VOLT_ALARM"), //
		OVER_VOLT_WARNING(10, "OVER_VOLT_WARNING"), //
		UNDER_VOLT_ALARM(11, "UNDER_VOLT_ALARM"), //
		UNDER_VOLT_WARNING(12, "UNDER_VOLT_WARNING"), //
		UNDER_SOC_MIN_ALARM(13, "UNDER_SOC_MIN_ALARM"), //
		UNDER_SOC_MIN_WARNING(14, "UNDER_SOC_MIN_WARNING"), //
		OVER_SOC_MAX_ALARM(15, "OVER_SOC_MAX_ALARM"), //
		OVER_SOC_MAX_WARNING(16, "OVER_SOC_MAX_WARNING"), //
		VOLTAGE_IMBALANCE_WARNING(17, "VOLTAGE_IMBALANCE_WARNING"), //
		TEMPERATURE_IMBALANCE_ALARM(18, "TEMPERATURE_IMBALANCE_ALARM"), //
		TEMPERATURE_IMBALANCE_WARNING(19, "TEMPERATURE_IMBALANCE_WARNING"), //
		CONTACTOR_ERROR(20, "CONTACTOR_ERROR"), //
		FAN_ERROR(21, "FAN_ERROR"), //
		GROUND_FAULT(22, "GROUND_FAULT"), //
		OPEN_DOOR_ERROR(23, "OPEN_DOOR_ERROR"), //
		CURRENT_IMBALANCE_WARNING(24, "CURRENT_IMBALANCE_WARNING"), //
		OTHER_ALARM(25, "OTHER_ALARM"), //
		OTHER_WARNING(26, "OTHER_WARNING"), //
		RESERVED_1(27, "RESERVED_1"), //
		CONFIGURATION_ALARM(28, "CONFIGURATION_ALARM"), //
		CONFIGURATION_WARNING(29, "CONFIGURATION_WARNING"); //

		private final int value;
		private final String name;

		private S802_Evt1(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S802_ReqInvState implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		NO_REQUEST(0, "NO_REQUEST"), //
		START(1, "START"), //
		STOP(2, "STOP"); //

		private final int value;
		private final String name;

		private S802_ReqInvState(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S802_SetOp implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		CONNECT(1, "CONNECT"), //
		DISCONNECT(2, "DISCONNECT"); //

		private final int value;
		private final String name;

		private S802_SetOp(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S802_SetInvState implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		INVERTER_STOPPED(1, "INVERTER_STOPPED"), //
		INVERTER_STANDBY(2, "INVERTER_STANDBY"), //
		INVERTER_STARTED(3, "INVERTER_STARTED"); //

		private final int value;
		private final String name;

		private S802_SetInvState(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64001 implements SunSpecPoint {
		CMD(new PointImpl(//
				"S64001_CMD", //
				"Command Code", //
				"", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_WRITE, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		H_W_REV(new PointImpl(//
				"S64001_H_W_REV", //
				"Hardware Revision", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		R_S_F_W_REV(new PointImpl(//
				"S64001_R_S_F_W_REV", //
				"RS FW Revision", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		O_S_F_W_REV(new PointImpl(//
				"S64001_O_S_F_W_REV", //
				"OS FW Revision", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		PROD_REV(new PointImpl(//
				"S64001_PROD_REV", //
				"Product Revision", //
				"", //
				"", //
				PointType.STRING2, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		BOOTS(new PointImpl(//
				"S64001_BOOTS", //
				"Boot Count", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		SWITCH(new PointImpl(//
				"S64001_SWITCH", //
				"DIP Switches", //
				"", //
				"", //
				PointType.BITFIELD16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		SENSORS(new PointImpl(//
				"S64001_SENSORS", //
				"Num Detected Sensors", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TALKING(new PointImpl(//
				"S64001_TALKING", //
				"Num Communicating Sensors", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		STATUS(new PointImpl(//
				"S64001_STATUS", //
				"System Status", //
				"", //
				"", //
				PointType.BITFIELD16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		CONFIG(new PointImpl(//
				"S64001_CONFIG", //
				"System Configuration", //
				"", //
				"", //
				PointType.BITFIELD16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		L_E_DBLINK(new PointImpl(//
				"S64001_L_E_DBLINK", //
				"LED Blink Threshold", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		L_E_DON(new PointImpl(//
				"S64001_L_E_DON", //
				"LED On Threshold", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		RESERVED(new PointImpl(//
				"S64001_RESERVED", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		LOC(new PointImpl(//
				"S64001_LOC", //
				"Location String", //
				"", //
				"", //
				PointType.STRING16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S1ID(new PointImpl(//
				"S64001_S1ID", //
				"Sensor 1 Unit ID", //
				"", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S1_ADDR(new PointImpl(//
				"S64001_S1_ADDR", //
				"Sensor 1 Address", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S1_O_S_VER(new PointImpl(//
				"S64001_S1_O_S_VER", //
				"Sensor 1 OS Version", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S1_VER(new PointImpl(//
				"S64001_S1_VER", //
				"Sensor 1 Product Version", //
				"", //
				"", //
				PointType.STRING2, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S1_SERIAL(new PointImpl(//
				"S64001_S1_SERIAL", //
				"Sensor 1 Serial Num", //
				"", //
				"", //
				PointType.STRING5, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S2ID(new PointImpl(//
				"S64001_S2ID", //
				"Sensor 2 Unit ID", //
				"", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S2_ADDR(new PointImpl(//
				"S64001_S2_ADDR", //
				"Sensor 2 Address", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S2_O_S_VER(new PointImpl(//
				"S64001_S2_O_S_VER", //
				"Sensor 2 OS Version", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S2_VER(new PointImpl(//
				"S64001_S2_VER", //
				"Sensor 2 Product Version", //
				"", //
				"", //
				PointType.STRING2, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S2_SERIAL(new PointImpl(//
				"S64001_S2_SERIAL", //
				"Sensor 2 Serial Num", //
				"", //
				"", //
				PointType.STRING5, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S3ID(new PointImpl(//
				"S64001_S3ID", //
				"Sensor 3 Unit ID", //
				"", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S3_ADDR(new PointImpl(//
				"S64001_S3_ADDR", //
				"Sensor 3 Address", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S3_O_S_VER(new PointImpl(//
				"S64001_S3_O_S_VER", //
				"Sensor 3 OS Version", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S3_VER(new PointImpl(//
				"S64001_S3_VER", //
				"Sensor 3 Product Version", //
				"", //
				"", //
				PointType.STRING2, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S3_SERIAL(new PointImpl(//
				"S64001_S3_SERIAL", //
				"Sensor 3 Serial Num", //
				"", //
				"", //
				PointType.STRING5, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S4ID(new PointImpl(//
				"S64001_S4ID", //
				"Sensor 4 Unit ID", //
				"", //
				"", //
				PointType.ENUM16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S4_ADDR(new PointImpl(//
				"S64001_S4_ADDR", //
				"Sensor 4 Address", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S4_O_S_VER(new PointImpl(//
				"S64001_S4_O_S_VER", //
				"Sensor 4 OS Version", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S4_VER(new PointImpl(//
				"S64001_S4_VER", //
				"Sensor 4 Product Version", //
				"", //
				"", //
				PointType.STRING2, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S4_SERIAL(new PointImpl(//
				"S64001_S4_SERIAL", //
				"Sensor 4 Serial Num", //
				"", //
				"", //
				PointType.STRING5, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S64001(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S64101 implements SunSpecPoint {
		ELTEK_COUNTRY_CODE(new PointImpl(//
				"S64101_ELTEK_COUNTRY_CODE", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ELTEK_FEEDING_PHASE(new PointImpl(//
				"S64101_ELTEK_FEEDING_PHASE", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ELTEK_A_P_D_METHOD(new PointImpl(//
				"S64101_ELTEK_A_P_D_METHOD", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ELTEK_A_P_D_POWER_REF(new PointImpl(//
				"S64101_ELTEK_A_P_D_POWER_REF", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ELTEK_R_P_S_METHOD(new PointImpl(//
				"S64101_ELTEK_R_P_S_METHOD", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ELTEK_R_P_S_Q_REF(new PointImpl(//
				"S64101_ELTEK_R_P_S_Q_REF", //
				"", //
				"", //
				"", //
				PointType.UINT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ELTEK_R_P_S_COS_PHI_REF(new PointImpl(//
				"S64101_ELTEK_R_P_S_COS_PHI_REF", //
				"", //
				"", //
				"", //
				PointType.INT16, //
				false, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S64101(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S64110 implements SunSpecPoint {
		MAJOR_F_W_REV(new PointImpl(//
				"S64110_MAJOR_F_W_REV", //
				"AXS Major Firmware Number", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		MID_F_W_REV(new PointImpl(//
				"S64110_MID_F_W_REV", //
				"AXS Mid Firmware Number", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		MINOR_F_W_REV(new PointImpl(//
				"S64110_MINOR_F_W_REV", //
				"AXS Minor Firmware Number", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ENCRYP_KEY(new PointImpl(//
				"S64110_ENCRYP_KEY", //
				"Encryption Key", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		M_A_C_ADDRESS(new PointImpl(//
				"S64110_M_A_C_ADDRESS", //
				"MAC Address", //
				"", //
				"", //
				PointType.STRING7, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		WRITE_PASSWORD(new PointImpl(//
				"S64110_WRITE_PASSWORD", //
				"Write Password", //
				"", //
				"", //
				PointType.STRING8, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ENABLE_D_H_C_P(new PointImpl(//
				"S64110_ENABLE_D_H_C_P", //
				"Enable DHCP", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		T_C_P_I_P_ADDRESS(new PointImpl(//
				"S64110_T_C_P_I_P_ADDRESS", //
				"TCPIP Address", //
				"", //
				"", //
				PointType.IPADDR, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		GATEWAY_ADDRESS(new PointImpl(//
				"S64110_GATEWAY_ADDRESS", //
				"TCPIP Gateway", //
				"", //
				"", //
				PointType.IPADDR, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		T_C_P_I_P_NETMASK(new PointImpl(//
				"S64110_T_C_P_I_P_NETMASK", //
				"TCPIP Netmask", //
				"", //
				"", //
				PointType.IPADDR, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		D_N_S1_ADDRESS(new PointImpl(//
				"S64110_D_N_S1_ADDRESS", //
				"TCPIP DNS1", //
				"", //
				"", //
				PointType.IPADDR, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		D_N_S2_ADDRESS(new PointImpl(//
				"S64110_D_N_S2_ADDRESS", //
				"TCPIP DNS2", //
				"", //
				"", //
				PointType.IPADDR, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		MODBUS_PORT(new PointImpl(//
				"S64110_MODBUS_PORT", //
				"ModBus Port", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S_M_T_P_SERVER_NM(new PointImpl(//
				"S64110_S_M_T_P_SERVER_NM", //
				"SMTP Server Name", //
				"", //
				"", //
				PointType.STRING20, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S_M_T_P_ACCOUNT_NM(new PointImpl(//
				"S64110_S_M_T_P_ACCOUNT_NM", //
				"SMTP Account Name", //
				"", //
				"", //
				PointType.STRING16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S_M_T_P_ENABLE_S_S_L(new PointImpl(//
				"S64110_S_M_T_P_ENABLE_S_S_L", //
				"Enable SMTP SSL", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64110_SMTP_enable_SSL.values())), //
		S_M_T_P_PASSWORD(new PointImpl(//
				"S64110_S_M_T_P_PASSWORD", //
				"SMTP Password", //
				"", //
				"", //
				PointType.STRING8, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		S_M_T_P_USER_NM(new PointImpl(//
				"S64110_S_M_T_P_USER_NM", //
				"SMTP User Name", //
				"", //
				"", //
				PointType.STRING20, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		STAT_EMAIL_INT(new PointImpl(//
				"S64110_STAT_EMAIL_INT", //
				"Status Email Interval", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		STAT_START_H_R(new PointImpl(//
				"S64110_STAT_START_H_R", //
				"Status Email Start Hour", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		STAT_EMAIL_SUB(new PointImpl(//
				"S64110_STAT_EMAIL_SUB", //
				"Status Email Subject", //
				"", //
				"", //
				PointType.STRING25, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		STAT_EMAIL_ADDR1(new PointImpl(//
				"S64110_STAT_EMAIL_ADDR1", //
				"Status Email to Address 1", //
				"", //
				"", //
				PointType.STRING20, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		STAT_EMAIL_ADDR2(new PointImpl(//
				"S64110_STAT_EMAIL_ADDR2", //
				"Status Email to Address 2", //
				"", //
				"", //
				PointType.STRING20, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ALARM_EMAIL_EN(new PointImpl(//
				"S64110_ALARM_EMAIL_EN", //
				"Enable Alarm Email", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64110_Alarm_email_en.values())), //
		ALARM_EMAIL_SUB(new PointImpl(//
				"S64110_ALARM_EMAIL_SUB", //
				"Alarm Email Subject", //
				"", //
				"", //
				PointType.STRING25, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ALARM_EMAIL_ADDR1(new PointImpl(//
				"S64110_ALARM_EMAIL_ADDR1", //
				"Alarm Email to Address 1", //
				"", //
				"", //
				PointType.STRING20, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		ALARM_EMAIL_ADDR2(new PointImpl(//
				"S64110_ALARM_EMAIL_ADDR2", //
				"Alarm Email to Address 2", //
				"", //
				"", //
				PointType.STRING20, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		F_T_P_PASSWORD(new PointImpl(//
				"S64110_F_T_P_PASSWORD", //
				"FTP Password", //
				"", //
				"", //
				PointType.STRING8, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		T_E_L_N_E_T_PASSWORD(new PointImpl(//
				"S64110_T_E_L_N_E_T_PASSWORD", //
				"Telnet Password", //
				"", //
				"", //
				PointType.STRING8, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		LOG_WRITE_INT(new PointImpl(//
				"S64110_LOG_WRITE_INT", //
				"SD-Card Datalog Write Interval", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		LOG_RETAIN(new PointImpl(//
				"S64110_LOG_RETAIN", //
				"SD-Card Datalog Retain", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		LOG_MODE(new PointImpl(//
				"S64110_LOG_MODE", //
				"SD-Card Datalog Mode", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64110_Log_mode.values())), //
		N_T_P_SERVER_NM(new PointImpl(//
				"S64110_N_T_P_SERVER_NM", //
				"NTP Timer Server Name", //
				"", //
				"", //
				PointType.STRING20, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		N_T_P_ENABLE(new PointImpl(//
				"S64110_N_T_P_ENABLE", //
				"Enable Network Time", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64110_NTP_enable.values())), //
		TIME_ZONE(new PointImpl(//
				"S64110_TIME_ZONE", //
				"Time Zone", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DATE_YEAR(new PointImpl(//
				"S64110_DATE_YEAR", //
				"Year", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DATE_MONTH(new PointImpl(//
				"S64110_DATE_MONTH", //
				"Month", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		DATE_DAY(new PointImpl(//
				"S64110_DATE_DAY", //
				"Day", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TIME_HOUR(new PointImpl(//
				"S64110_TIME_HOUR", //
				"Hour", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TIME_MINUTE(new PointImpl(//
				"S64110_TIME_MINUTE", //
				"Minute", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		TIME_SECOND(new PointImpl(//
				"S64110_TIME_SECOND", //
				"Second", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		BATTERY_TEMP(new PointImpl(//
				"S64110_BATTERY_TEMP", //
				"Battery Temperature", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Temp_SF", //
				new OptionsEnum[0])), //
		AMBIENT_TEMP(new PointImpl(//
				"S64110_AMBIENT_TEMP", //
				"Ambient Temperature", //
				"", //
				"", //
				PointType.INT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.DEGREE_CELSIUS, //
				"Temp_SF", //
				new OptionsEnum[0])), //
		TEMP_S_F(new PointImpl(//
				"S64110_TEMP_S_F", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		A_X_S_ERROR(new PointImpl(//
				"S64110_A_X_S_ERROR", //
				"AXS Error", //
				"", //
				"", //
				PointType.BITFIELD16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		A_X_S_STATUS(new PointImpl(//
				"S64110_A_X_S_STATUS", //
				"AXS Status", //
				"", //
				"", //
				PointType.BITFIELD16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		A_X_S_SPARE(new PointImpl(//
				"S64110_A_X_S_SPARE", //
				"Spare", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S64110(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S64110_SMTP_enable_SSL implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		ASX_DISABLED(0, "ASX_DISABLED"), //
		ASX_ENABLED(1, "ASX_ENABLED"); //

		private final int value;
		private final String name;

		private S64110_SMTP_enable_SSL(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64110_Alarm_email_en implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		ASX_DISABLED(0, "ASX_DISABLED"), //
		ASX_ENABLED(1, "ASX_ENABLED"); //

		private final int value;
		private final String name;

		private S64110_Alarm_email_en(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64110_Log_mode implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		LOG_DISABLED(0, "LOG_DISABLED"), //
		LOG_EXCEL(1, "LOG_EXCEL"), //
		LOG_COMPACT(2, "LOG_COMPACT"); //

		private final int value;
		private final String name;

		private S64110_Log_mode(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64110_NTP_enable implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		ASX_DISABLED(0, "ASX_DISABLED"), //
		ASX_ENABLED(1, "ASX_ENABLED"); //

		private final int value;
		private final String name;

		private S64110_NTP_enable(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64111 implements SunSpecPoint {
		PORT(new PointImpl(//
				"S64111_PORT", //
				"Port Number", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S64111_V_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		A_SF(new PointImpl(//
				"S64111_A_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		P_SF(new PointImpl(//
				"S64111_P_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		AH_SF(new PointImpl(//
				"S64111_AH_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		KWH_SF(new PointImpl(//
				"S64111_KWH_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		BATT_V(new PointImpl(//
				"S64111_BATT_V", //
				"Battery Voltage", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		ARRAY_V(new PointImpl(//
				"S64111_ARRAY_V", //
				"Array Voltage", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		OUTPUT_A(new PointImpl(//
				"S64111_OUTPUT_A", //
				"Output Current", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"A_SF", //
				new OptionsEnum[0])), //
		INPUT_A(new PointImpl(//
				"S64111_INPUT_A", //
				"Array Current", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"P_SF", //
				new OptionsEnum[0])), //
		CHARGER_ST(new PointImpl(//
				"S64111_CHARGER_ST", //
				"Operating State", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64111_ChargerSt.values())), //
		OUTPUT_W(new PointImpl(//
				"S64111_OUTPUT_W", //
				"Output Wattage", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"P_SF", //
				new OptionsEnum[0])), //
		TODAY_MIN_BAT_V(new PointImpl(//
				"S64111_TODAY_MIN_BAT_V", //
				"Todays Minimum Battery Voltage", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		TODAY_MAX_BAT_V(new PointImpl(//
				"S64111_TODAY_MAX_BAT_V", //
				"Todays Maximum Battery Voltage", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		VOCV(new PointImpl(//
				"S64111_VOCV", //
				"VOC", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		TODAY_MAX_V_O_C(new PointImpl(//
				"S64111_TODAY_MAX_V_O_C", //
				"Todays Maximum VOC", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		TODAYK_WH_OUTPUT(new PointImpl(//
				"S64111_TODAYK_WH_OUTPUT", //
				"Todays kWh", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.KILOWATT_HOURS, //
				"KWH_SF", //
				new OptionsEnum[0])), //
		TODAY_A_H_OUTPUT(new PointImpl(//
				"S64111_TODAY_A_H_OUTPUT", //
				"Todays AH", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE_HOURS, //
				"AH_SF", //
				new OptionsEnum[0])), //
		LIFE_TIME_K_W_H_OUT(new PointImpl(//
				"S64111_LIFE_TIME_K_W_H_OUT", //
				"Lifetime kWh", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.KILOWATT_HOURS, //
				"P_SF", //
				new OptionsEnum[0])), //
		LIFE_TIME_A_H_OUT(new PointImpl(//
				"S64111_LIFE_TIME_A_H_OUT", //
				"Lifetime kAH", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.KILOAMPERE_HOURS, //
				"KWH_SF", //
				new OptionsEnum[0])), //
		LIFE_TIME_MAX_OUT(new PointImpl(//
				"S64111_LIFE_TIME_MAX_OUT", //
				"Lifetime Maximum Output Wattage", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"P_SF", //
				new OptionsEnum[0])), //
		LIFE_TIME_MAX_BATT(new PointImpl(//
				"S64111_LIFE_TIME_MAX_BATT", //
				"Lifetime Maximum Battery Voltage", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		LIFE_TIME_MAX_V_O_C(new PointImpl(//
				"S64111_LIFE_TIME_MAX_V_O_C", //
				"Lifetime Maximum VOC Voltage", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S64111(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S64111_ChargerSt implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(0, "OFF"), //
		FLOAT(1, "FLOAT"), //
		BULK(2, "BULK"), //
		ABSORB(3, "ABSORB"), //
		EQ(4, "EQ"); //

		private final int value;
		private final String name;

		private S64111_ChargerSt(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112 implements SunSpecPoint {
		PORT(new PointImpl(//
				"S64112_PORT", //
				"Port Number", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		V_SF(new PointImpl(//
				"S64112_V_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_SF(new PointImpl(//
				"S64112_C_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		H_SF(new PointImpl(//
				"S64112_H_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		P_SF(new PointImpl(//
				"S64112_P_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		AH_SF(new PointImpl(//
				"S64112_AH_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		KWH_SF(new PointImpl(//
				"S64112_KWH_SF", //
				"", //
				"", //
				"", //
				PointType.SUNSSF, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_FAULT(new PointImpl(//
				"S64112_C_C_CONFIG_FAULT", //
				"Faults", //
				"", //
				"", //
				PointType.BITFIELD16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_ABSORB_V(new PointImpl(//
				"S64112_C_C_CONFIG_ABSORB_V", //
				"Absorb", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_ABSORB_HR(new PointImpl(//
				"S64112_C_C_CONFIG_ABSORB_HR", //
				"Absorb Time", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"H_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_ABSORB_END_A(new PointImpl(//
				"S64112_C_C_CONFIG_ABSORB_END_A", //
				"Absorb End", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_REBULK_V(new PointImpl(//
				"S64112_C_C_CONFIG_REBULK_V", //
				"Rebulk", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_FLOAT_V(new PointImpl(//
				"S64112_C_C_CONFIG_FLOAT_V", //
				"Float", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_MAX_CHG_A(new PointImpl(//
				"S64112_C_C_CONFIG_MAX_CHG_A", //
				"Maximum Charge", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_EQUALIZE_V(new PointImpl(//
				"S64112_C_C_CONFIG_EQUALIZE_V", //
				"Equalize", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_EQUALIZE_HR(new PointImpl(//
				"S64112_C_C_CONFIG_EQUALIZE_HR", //
				"Equalize Time", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_AUTO_EQUALIZE(new PointImpl(//
				"S64112_C_C_CONFIG_AUTO_EQUALIZE", //
				"Auto Equalize Interval", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_M_P_P_T_MODE(new PointImpl(//
				"S64112_C_C_CONFIG_M_P_P_T_MODE", //
				"MPPT mode", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_MPPT_mode.values())), //
		C_C_CONFIG_SWEEP_WIDTH(new PointImpl(//
				"S64112_C_C_CONFIG_SWEEP_WIDTH", //
				"Sweep Width", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_sweep_width.values())), //
		C_C_CONFIG_SWEEP_MAX(new PointImpl(//
				"S64112_C_C_CONFIG_SWEEP_MAX", //
				"Sweep Maximum", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_sweep_max.values())), //
		C_C_CONFIG_U_PICK_DUTY_CYC(new PointImpl(//
				"S64112_C_C_CONFIG_U_PICK_DUTY_CYC", //
				"U-Pick PWM Duty Cycle", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_GRID_TIE(new PointImpl(//
				"S64112_C_C_CONFIG_GRID_TIE", //
				"Grid Tie Mode", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_grid_tie.values())), //
		C_C_CONFIG_TEMP_COMP(new PointImpl(//
				"S64112_C_C_CONFIG_TEMP_COMP", //
				"Temp Comp Mode", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_temp_comp.values())), //
		C_C_CONFIG_TEMP_COMP_LLIMT(new PointImpl(//
				"S64112_C_C_CONFIG_TEMP_COMP_LLIMT", //
				"Temp Comp Lower Limit", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_TEMP_COMP_HLIMT(new PointImpl(//
				"S64112_C_C_CONFIG_TEMP_COMP_HLIMT", //
				"Temp Comp Upper Limit", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_AUTO_RESTART(new PointImpl(//
				"S64112_C_C_CONFIG_AUTO_RESTART", //
				"Auto Restart Mode", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_auto_restart.values())), //
		C_C_CONFIG_WAKEUP_V_O_C(new PointImpl(//
				"S64112_C_C_CONFIG_WAKEUP_V_O_C", //
				"Wakeup VOC Change", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_SNOOZE_MODE_A(new PointImpl(//
				"S64112_C_C_CONFIG_SNOOZE_MODE_A", //
				"Snooze Mode", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_WAKEUP_INTERVAL(new PointImpl(//
				"S64112_C_C_CONFIG_WAKEUP_INTERVAL", //
				"Wakeup Interval", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_MODE(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_MODE", //
				"AUX Output Mode", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_AUX_mode.values())), //
		C_C_CONFIG_A_U_X_CONTROL(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_CONTROL", //
				"AUX Output Control", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_AUX_control.values())), //
		C_C_CONFIG_A_U_X_STATE(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_STATE", //
				"AUX Output State", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_AUX_state.values())), //
		C_C_CONFIG_A_U_X_POLARITY(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_POLARITY", //
				"AUX Output Polarity", //
				"", //
				"", //
				PointType.ENUM16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				S64112_CC_Config_AUX_polarity.values())), //
		C_C_CONFIG_A_U_X_L_BATT_DISC(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_L_BATT_DISC", //
				"AUX Low Battery Disconnect", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_L_BATT_RCON(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_L_BATT_RCON", //
				"AUX Low Battery Reconnect", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_L_BATT_DLY(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_L_BATT_DLY", //
				"AUX Low Battery Disconnect Delay", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_VENT_FAN_V(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_VENT_FAN_V", //
				"AUX Vent Fan", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_P_V_TRIGGER_V(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_P_V_TRIGGER_V", //
				"AUX PV Trigger", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_P_V_TRG_H_TM(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_P_V_TRG_H_TM", //
				"AUX PV Trigger Hold Time", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_NLITE_THRS_V(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_NLITE_THRS_V", //
				"AUX Night Light Threshold", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_NLITE_ON_TM(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_NLITE_ON_TM", //
				"AUX Night Light On Time", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"H_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_NLITE_ON_HIST(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_NLITE_ON_HIST", //
				"AUX Night Light On Hysterisis", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_NLITE_OFF_HIST(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_NLITE_OFF_HIST", //
				"AUX Night Light Off Hysterisis", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_ERROR_BATT_V(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_ERROR_BATT_V", //
				"AUX Error Output Low Battery", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_DIVERT_H_TIME(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_DIVERT_H_TIME", //
				"AUX Divert Hold Time", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_DIVERT_DLY_TIME(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_DIVERT_DLY_TIME", //
				"AUX Divert Delay Time", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_DIVERT_REL_V(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_DIVERT_REL_V", //
				"AUX Divert Relative", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_A_U_X_DIVERT_HYST_V(new PointImpl(//
				"S64112_C_C_CONFIG_A_U_X_DIVERT_HYST_V", //
				"AUX Divert Hysterisis", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_MAJOR_F_W_REV(new PointImpl(//
				"S64112_C_C_CONFIG_MAJOR_F_W_REV", //
				"FM CC Major Firmware Number", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_MID_F_W_REV(new PointImpl(//
				"S64112_C_C_CONFIG_MID_F_W_REV", //
				"FM CC Mid Firmware Number", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_MINOR_F_W_REV(new PointImpl(//
				"S64112_C_C_CONFIG_MINOR_F_W_REV", //
				"FM CC Minor Firmware Number", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_DAY_OFFSET(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_DAY_OFFSET", //
				"Set Data Log Day Offset", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_CUR_DAY_OFF(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_CUR_DAY_OFF", //
				"Current Data Log Day Offset", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_DAILY_A_H(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_DAILY_A_H", //
				"Data Log Daily", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE_HOURS, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_DAILY_K_W_H(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_DAILY_K_W_H", //
				"Data Log Daily", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.KILOWATT_HOURS, //
				"KWH_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_MAX_OUT_A(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_MAX_OUT_A", //
				"Data Log Daily Maximum Output", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.AMPERE, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_MAX_OUT_W(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_MAX_OUT_W", //
				"Data Log Daily Maximum Output", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.WATT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_ABSORB_T(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_ABSORB_T", //
				"Data Log Daily Absorb Time", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_FLOAT_T(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_FLOAT_T", //
				"Data Log Daily Float Time", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_MIN_BATT_V(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_MIN_BATT_V", //
				"Data Log Daily Minimum Battery", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_MAX_BATT_V(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_MAX_BATT_V", //
				"Data Log Daily Maximum Battery", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_MAX_INPUT_V(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_MAX_INPUT_V", //
				"Data Log Daily Maximum Input", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.VOLT, //
				"V_SF", //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_CLEAR(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_CLEAR", //
				"Data Log Clear", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])), //
		C_C_CONFIG_DATA_LOG_CLR_COMP(new PointImpl(//
				"S64112_C_C_CONFIG_DATA_LOG_CLR_COMP", //
				"Data Log Clear Complement", //
				"", //
				"", //
				PointType.UINT16, //
				true, //
				AccessMode.READ_ONLY, //
				Unit.NONE, //
				null, //
				new OptionsEnum[0])); //

		protected final PointImpl impl;

		private S64112(PointImpl impl) {
			this.impl = impl;
		}

		@Override
		public PointImpl get() {
			return this.impl;
		}
	}

	public static enum S64112_CC_Config_MPPT_mode implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		AUTO(0, "AUTO"), //
		U_PICK(1, "U_PICK"), //
		WIND(2, "WIND"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_MPPT_mode(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_sweep_width implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		HALF(0, "HALF"), //
		FULL(1, "FULL"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_sweep_width(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_sweep_max implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		EIGHTY_PERCENT(0, "EIGHTY_PERCENT"), //
		EIGHTY_FIVE_PERCENT(1, "EIGHTY_FIVE_PERCENT"), //
		NINTY_PERCENT(2, "NINTY_PERCENT"), //
		NINTY_NINE_PERCENT(3, "NINTY_NINE_PERCENT"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_sweep_max(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_grid_tie implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		DISABLED(0, "DISABLED"), //
		ENABLED(1, "ENABLED"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_grid_tie(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_temp_comp implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		WIDE(0, "WIDE"), //
		LIMITED(1, "LIMITED"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_temp_comp(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_auto_restart implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(0, "OFF"), //
		EVERY_90_MINUTES(1, "EVERY_90_MINUTES"), //
		EVERY_90_MINUTES_IF_ABSORB_OR_FLOAT(2, "EVERY_90_MINUTES_IF_ABSORB_OR_FLOAT"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_auto_restart(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_AUX_mode implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		FLOAT(0, "FLOAT"), //
		DIVERSION_RELAY(1, "DIVERSION_RELAY"), //
		DIVERSION_SOLID_ST(2, "DIVERSION_SOLID_ST"), //
		LOW_BATT_DISCONNECT(3, "LOW_BATT_DISCONNECT"), //
		REMOTE(4, "REMOTE"), //
		VENT_FAN(5, "VENT_FAN"), //
		P_V_TRIGGER(6, "P_V_TRIGGER"), //
		ERROR_OUTPUT(7, "ERROR_OUTPUT"), //
		NIGHT_LIGHT(8, "NIGHT_LIGHT"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_AUX_mode(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_AUX_control implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		OFF(0, "OFF"), //
		AUTO(1, "AUTO"), //
		ON(2, "ON"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_AUX_control(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_AUX_state implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		DISABLED(0, "DISABLED"), //
		ENABLED(1, "ENABLED"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_AUX_state(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public static enum S64112_CC_Config_AUX_polarity implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		LOW(0, "LOW"), //
		HIGH(1, "HIGH"); //

		private final int value;
		private final String name;

		private S64112_CC_Config_AUX_polarity(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

	public final String label;
	public final String description;
	public final String notes;
	public final int length;
	public final SunSpecPoint[] points;
	public final SunSpecModelType modelType;

	private SunSpecModel(String label, String description, String notes, int length, SunSpecPoint[] points,
			SunSpecModelType modelType) {
		this.label = label;
		this.description = description;
		this.notes = notes;
		this.length = length;
		this.points = points;
		this.modelType = modelType;
	}

	@Override
	public SunSpecPoint[] points() {
		return this.points;
	}

	@Override
	public String label() {
		return this.label;
	}
=======
>>>>>>> develop
}
