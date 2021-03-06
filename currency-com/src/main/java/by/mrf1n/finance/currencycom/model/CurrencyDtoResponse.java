package by.mrf1n.finance.currencycom.model;

import by.mrf1n.finance.currencycom.model.enums.CurrencyType;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class CurrencyDtoResponse implements Serializable {

    private Double commissionFixed;
    private Double commissionMin;
    private Double commissionPercent;
    private String displaySymbol;
    private Double maxWithdrawal;
    private Double minDeposit;
    private Double minWithdrawal;
    private String name;
    private Integer precision;
    private CurrencyType type;

}
