package school.sptech.pool_service.enums;

import school.sptech.pool_service.exceptions.BinarioInvalidoException;

public enum Status {
    INATIVO(0),
    ATIVO(1);

    private final Integer binary;

    Status(Integer binary) {
        this.binary = binary;
    }

    public Integer getBinary() {
        return binary;
    }

    public static Status fromCodigo(Integer binary) {
        for (Status status : values()) {
            if (status.binary.equals(binary)) {
                return status;
            }
        }

        throw new BinarioInvalidoException("O valor binário inserido não é válido");
    }
}
