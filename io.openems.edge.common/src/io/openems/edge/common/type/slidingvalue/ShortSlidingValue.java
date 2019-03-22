package io.openems.edge.common.type.slidingvalue;

import java.util.Optional;
import java.util.OptionalDouble;

import io.openems.common.types.OpenemsType;

public class ShortSlidingValue extends AbstractNumberSlidingValue<Short> {

	public ShortSlidingValue() {
		super(OpenemsType.SHORT);
	}

	@Override
	protected Optional<Short> getSlidingValue() {
		OptionalDouble result = this.values.stream() //
				.mapToInt(Short::intValue) //
				.average();
		if (result.isPresent()) {
			double doubleValue = result.getAsDouble();
			long value = Math.round(doubleValue);
			if (value < Short.MIN_VALUE || value > Short.MAX_VALUE) {
				return Optional.empty();
			} else {
				return Optional.of((short) value);
			}
		} else {
			return Optional.empty();
		}
	}
}
