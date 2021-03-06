package by.mrf1n.finance.currencycom.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigInteger;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
public class TransactionsRequest implements Serializable {

    private String apiKey;
    private BigInteger recvWindow;
    private String signature;
    private BigInteger timestamp;
    private BigInteger endTime;
    private Integer limit;
    private BigInteger startTime;
}
