package by.mrf1n.finance.currencycom.model;

import by.mrf1n.finance.currencycom.model.enums.Interval;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class RateLimits implements Serializable {

  private String interval;
  private Integer intervalNum;
  private Integer limit;
  private String rateLimitType;

}
