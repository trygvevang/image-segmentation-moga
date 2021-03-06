package GeneticAlgorithm;

/**
 * Represents the neighborhood relationship between two pixels
 */
class PixelNeighbor {
    private Pixel pixel;
    private Pixel neighbor;
    private double colorDistance; // Euclidean Color Distance

    PixelNeighbor(Pixel pixel, Pixel neighbor, double colorDistance) {
        this.pixel = pixel;
        this.neighbor = neighbor;
        this.colorDistance = colorDistance;
    }

    Pixel getPixel() {
        return pixel;
    }

    Pixel getNeighbor() {
        return neighbor;
    }

    double getColorDistance() {
        return colorDistance;
    }
}
