package likelihoodDetectionModule.normalizer;

import PamDetection.AcousticDataUnit;

/**
 * The data type generated by the normalizer PamProcess.
 * 
 * @author Dave Flogeras
 *
 */
public class NormalizedDataUnit extends AcousticDataUnit {

	NormalizedData[] normalizedData = null;
	
	public NormalizedDataUnit( long timeMilliseconds, int channelBitmap, long startSample, long duration ) {
		super( timeMilliseconds, channelBitmap, startSample, duration );
	}
	
	public void setData( NormalizedData[] data ) {
		this.normalizedData = data;
	}
	
	public NormalizedData[] getData() {
		return normalizedData;
	}
}