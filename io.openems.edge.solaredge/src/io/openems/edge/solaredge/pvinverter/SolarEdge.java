package io.openems.edge.solaredge.pvinverter;

import java.util.Map;

import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.osgi.service.metatype.annotations.Designate;

import com.google.common.collect.ImmutableMap;

import io.openems.edge.bridge.modbus.api.BridgeModbus;
<<<<<<< HEAD
import io.openems.edge.bridge.modbus.sunspec.ISunSpecModel;
=======
import io.openems.edge.bridge.modbus.sunspec.DefaultSunSpecModel;
>>>>>>> develop
import io.openems.edge.bridge.modbus.sunspec.SunSpecModel;
import io.openems.edge.common.component.OpenemsComponent;
import io.openems.edge.common.event.EdgeEventConstants;
import io.openems.edge.common.taskmanager.Priority;
import io.openems.edge.meter.api.SymmetricMeter;
import io.openems.edge.pvinverter.api.ManagedSymmetricPvInverter;
import io.openems.edge.pvinverter.sunspec.AbstractSunSpecPvInverter;
import io.openems.edge.pvinverter.sunspec.SunSpecPvInverter;

@Designate(ocd = Config.class, factory = true)
@Component(//
		name = "SolarEdge.PV-Inverter", //
		immediate = true, //
		configurationPolicy = ConfigurationPolicy.REQUIRE, //
		property = { //
				EventConstants.EVENT_TOPIC + "=" + EdgeEventConstants.TOPIC_CYCLE_EXECUTE_WRITE, //
				"type=PRODUCTION" //
		})
public class SolarEdge extends AbstractSunSpecPvInverter
		implements SunSpecPvInverter, ManagedSymmetricPvInverter, SymmetricMeter, OpenemsComponent, EventHandler {

	private final static int UNIT_ID = 1;
	private final static int READ_FROM_MODBUS_BLOCK = 1;

<<<<<<< HEAD
	private static final Map<ISunSpecModel, Priority> ACTIVE_MODELS = ImmutableMap.<ISunSpecModel, Priority>builder()
			.put(SunSpecModel.S_1, Priority.LOW) //
			.put(SunSpecModel.S_101, Priority.LOW) //
			.put(SunSpecModel.S_102, Priority.LOW) //
			.put(SunSpecModel.S_103, Priority.LOW) //
			.put(SunSpecModel.S_111, Priority.LOW) //
			.put(SunSpecModel.S_112, Priority.LOW) //
			.put(SunSpecModel.S_113, Priority.LOW) //
			.put(SunSpecModel.S_120, Priority.LOW) //
			.put(SunSpecModel.S_121, Priority.LOW) //
			.put(SunSpecModel.S_122, Priority.LOW) //
			.put(SunSpecModel.S_123, Priority.LOW) //
			.put(SunSpecModel.S_124, Priority.LOW) //
			.put(SunSpecModel.S_125, Priority.LOW) //
			.put(SunSpecModel.S_127, Priority.LOW) //
			.put(SunSpecModel.S_128, Priority.LOW) //
			.put(SunSpecModel.S_145, Priority.LOW) //
=======
	private static final Map<SunSpecModel, Priority> ACTIVE_MODELS = ImmutableMap.<SunSpecModel, Priority>builder()
			.put(DefaultSunSpecModel.S_1, Priority.LOW) //
			.put(DefaultSunSpecModel.S_101, Priority.LOW) //
			.put(DefaultSunSpecModel.S_102, Priority.LOW) //
			.put(DefaultSunSpecModel.S_103, Priority.LOW) //
			.put(DefaultSunSpecModel.S_111, Priority.LOW) //
			.put(DefaultSunSpecModel.S_112, Priority.LOW) //
			.put(DefaultSunSpecModel.S_113, Priority.LOW) //
			.put(DefaultSunSpecModel.S_120, Priority.LOW) //
			.put(DefaultSunSpecModel.S_121, Priority.LOW) //
			.put(DefaultSunSpecModel.S_122, Priority.LOW) //
			.put(DefaultSunSpecModel.S_123, Priority.LOW) //
			.put(DefaultSunSpecModel.S_124, Priority.LOW) //
			.put(DefaultSunSpecModel.S_125, Priority.LOW) //
			.put(DefaultSunSpecModel.S_127, Priority.LOW) //
			.put(DefaultSunSpecModel.S_128, Priority.LOW) //
			.put(DefaultSunSpecModel.S_145, Priority.LOW) //
>>>>>>> develop
			.build();

	@Reference
	protected ConfigurationAdmin cm;

	public SolarEdge() {
		super(//
				ACTIVE_MODELS, //
				OpenemsComponent.ChannelId.values(), //
				SymmetricMeter.ChannelId.values(), //
				ManagedSymmetricPvInverter.ChannelId.values(), //
				SunSpecPvInverter.ChannelId.values() //
		);
	}

	@Reference(policy = ReferencePolicy.STATIC, policyOption = ReferencePolicyOption.GREEDY, cardinality = ReferenceCardinality.MANDATORY)
	protected void setModbus(BridgeModbus modbus) {
		super.setModbus(modbus);
	}

	@Activate
	void activate(ComponentContext context, Config config) {
		super.activate(context, config.id(), config.alias(), config.enabled(), UNIT_ID, this.cm, "Modbus",
				config.modbus_id(), READ_FROM_MODBUS_BLOCK);
	}

	@Deactivate
	protected void deactivate() {
		super.deactivate();
	}

	@Override
	public void handleEvent(Event event) {
		super.handleEvent(event);
	}

}
