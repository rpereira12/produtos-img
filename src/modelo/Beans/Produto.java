
package modelo.Beans;




public class Produto {

    /**
     * @return the imagem
     */
    public byte[] getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }


    private String nomeProd;
    private String siglaProd;
    private String categoriaProd;
    private String descProd;
    private double compProd;
    private double largProd;
    private double altProd;
    private double precoProd;
    private String pesquisa;
    private byte[] imagem;
    
    
    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    /**
     * @return the nomeProd
     */
    public String getNomeProd() {
        return nomeProd;
    }

    /**
     * @param nomeProd the nomeProd to set
     */
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    /**
     * @return the siglaProd
     */
    public String getSiglaProd() {
        return siglaProd;
    }

    /**
     * @param siglaProd the siglaProd to set
     */
    public void setSiglaProd(String siglaProd) {
        this.siglaProd = siglaProd;
    }

    /**
     * @return the categoriaProd
     */
    public String getCategoriaProd() {
        return categoriaProd;
    }

    /**
     * @param categoriaProd the categoriaProd to set
     */
    public void setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
    }

    /**
     * @return the descProd
     */
    public String getDescProd() {
        return descProd;
    }

    /**
     * @param descProd the descProd to set
     */
    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    /**
     * @return the compProd
     */
    public double getCompProd() {
        return compProd;
    }

    /**
     * @param compProd the compProd to set
     */
    public void setCompProd(double compProd) {
        this.compProd = compProd;
    }

    /**
     * @return the largProd
     */
    public double getLargProd() {
        return largProd;
    }

    /**
     * @param largProd the largProd to set
     */
    public void setLargProd(double largProd) {
        this.largProd = largProd;
    }

    /**
     * @return the altProd
     */
    public double getAltProd() {
        return altProd;
    }

    /**
     * @param altProd the altProd to set
     */
    public void setAltProd(double altProd) {
        this.altProd = altProd;
    }

    /**
     * @return the precoProd
     */
    public double getPrecoProd() {
        return precoProd;
    }

    /**
     * @param precoProd the precoProd to set
     */
    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }
 
    
}
