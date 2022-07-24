package org.zerock.sample;

import org.springframework.stereotype.Component;

import com.sun.istack.internal.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class SampleHotel {
	
	@NotNull
	private Chef chef;
	
//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}
}
