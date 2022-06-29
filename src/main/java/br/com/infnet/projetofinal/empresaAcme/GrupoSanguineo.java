package br.com.infnet.projetofinal.empresaAcme;

public enum GrupoSanguineo {
    A(2), B(3), AB(4), O(1);

    private int id;

    GrupoSanguineo(int i) {
        this.id = i;
    }
}
