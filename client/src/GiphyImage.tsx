import * as React from 'react';

interface GiphyImageProps {
  name: string;
}

interface GiphyImageState {
  giphyUrl: string;
  isLoading: boolean;
}

class GiphyImage extends React.Component<{}, any> {

  constructor(props: GiphyImageProps) {
    super(props);
  }

  componentDidMount() {

  }

  render(
    <img src="{giphyUrl}" alt="{this.props.name}" width="200"/>
  )
}

export default GiphyImage;
