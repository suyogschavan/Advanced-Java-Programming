# %%
from pathlib import Path
import mne


sample_data_folder = mne.datasets.sample.data_path()
sample_data_raw_file = os.path.join(sample_data_folder, 'MEG', 'sample', 'sample_audvis_filt-0-40_raw.fif')
raw = mne.io.read_raw_fif(sample_data_raw_file)


# sample_dir = Path(mne.datasets.sample.data_path())
# sample_fname = sample_dir / 'MEG' / 'sample' / 'sample_audvis_raw.fif'

# raw = mne.io.read_raw_fif(sample_data_raw_file)


# raw = mne.io.read_raw_fif(sample_fname, preload=True)
# raw.crop(tmax=60)


# from mne.datasets import sample
# data_path = sample.data_path() 

# raw_fname = data_path + 'S001R04.edf'

# raw = mne.io.RawFile(raw_fname, preload=False)
# print (raw.info)
